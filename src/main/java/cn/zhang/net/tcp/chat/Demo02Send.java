package cn.zhang.net.tcp.chat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 用于发送数据
 * @author tako_
 *
 */
public class Demo02Send implements Runnable {
	//控制台输入流
	private BufferedReader console;
	//管道输出流
	private DataOutputStream dos;
	private boolean isRunning = true;
	
	//构造器
	public Demo02Send() {
		console = new BufferedReader(new InputStreamReader(System.in));
	}
	public Demo02Send(Socket client) {
		this();
		try {
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
			isRunning = false;
			CloseUtil.close(dos, console);
		}
	}
	
	//从控制台接收数据
	private String getMessageFromConsole() {
		String str = "";
		try {
			str = console.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	//发送数据
	public void send() {
		String message = getMessageFromConsole();
		try {
			if( null!=message && !message.equals("")) {
				dos.writeUTF(message);
				dos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
			isRunning = false;
			CloseUtil.close(dos, console);
		}		
	}
	//线程体
	@Override
	public void run() {
		while(isRunning) send();
	}
}
