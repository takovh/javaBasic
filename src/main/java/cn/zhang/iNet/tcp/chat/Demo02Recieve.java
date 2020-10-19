package cn.zhang.iNet.tcp.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 接收线程
 * @author tako_
 *
 */
public class Demo02Recieve implements Runnable {
	//输入流
	private DataInputStream dis;
	//线程标识
	private boolean isRunning = true;
	
	public Demo02Recieve() {}
	public Demo02Recieve(Socket client) {
		try {
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			isRunning = false;
			CloseUtil.close(dis);
		}
	}
	/**
	 * 接收数据
	 * @return
	 */
	public String recieve() {
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			e.printStackTrace();
			isRunning = false;
			CloseUtil.close(dis);
		}
		return msg;	
	}
	@Override
	public void run() {
		while(isRunning) {
			System.out.println(recieve());
		}
	}

}
