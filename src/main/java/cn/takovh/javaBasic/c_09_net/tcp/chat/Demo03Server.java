package cn.takovh.javaBasic.c_09_net.tcp.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 服务端（群聊）
 * 1.创建服务端 + 端口
 * 2.接收客户端的连接 阻塞式
 * 3.发送数据 + 接收数据
 * @author tako_
 *
 */
public class Demo03Server {
	private List<MyChannel> allConnect  = new ArrayList<MyChannel>();
	public static void main(String[] args) throws IOException{
		new Demo03Server().connect();
	}
	
	@SuppressWarnings("resource")
	public void connect() throws IOException {
		// 创建服务端 + 端口
		ServerSocket server = new ServerSocket(9999);
		
		// 接收数据 + 发送数据
		while (true) {
			Socket client = server.accept();// The method blocks until a connection is made.
			MyChannel channel = new MyChannel(client);
			allConnect.add(channel);
			new Thread(channel).start();//一条道路
		}
	}
	
	/**
	 * 内部类：代表一个客户端一条道路
	 * 输入流+输出流
	 * 接收数据+发送数据
	 * @author tako_
	 *
	 */
	private class MyChannel implements Runnable {
		private DataInputStream dis;
		private DataOutputStream dos;
		@SuppressWarnings("unused")
		private boolean isRunning = true;
		//构造器，初始化
		public MyChannel(Socket client) {
			try {
				dis =  new DataInputStream(client.getInputStream());//输入流
				dos = new DataOutputStream(client.getOutputStream());//输出流
			} catch (IOException e) {
				// e.printStackTrace();
				CloseUtil.close(dis, dos);
				isRunning = false;
			}
		}
		
		/***
		 * 读取数据
		 * @return
		 */
		private String recieve() {
			String msg = "";
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
				// e.printStackTrace();
				CloseUtil.close(dis);
				isRunning = false;
				allConnect.remove(this);
			}
			return msg;
		}
		
		/**
		 * 发送数据
		 */
		private void send(String msg) {
			if(null==msg||msg.equals("")) return;
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				// e.printStackTrace();
				CloseUtil.close(dos);
				isRunning = false;
				allConnect.remove(this);
			}
		}
		
		/**
		 * 发送给其他客户端
		 */
		private void sendToOthers(String msg) {
			//遍历容器
			for(MyChannel member : allConnect) {
				if(member==this) continue;
				member.send(msg);
			}
		}

		@Override
		public void run() {
			while(true) {
				String msg = recieve();
				//System.out.println(msg);
				//send(msg);
				sendToOthers(msg);
			}
		}
	}

	
}
