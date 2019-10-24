package cn.zhang.server.demo02;

import java.io.IOException;
import java.net.Socket;

/**
 * 一个请求与响应就是一个Dispatcher对象
 * @author tako_
 *
 */
public class Dispatcher implements Runnable{
	private Socket client;
	private Request req;
	private Response rep;
	private int code=200;
	public Dispatcher(Socket client) {
		this.client = client;
		try {
			req = new Request(client.getInputStream());
			rep = new Response(client.getOutputStream());
		} catch (IOException e) {
			code = 500;
			return ;
		}
	}
	
	@Override
	public void run() {
		Servlet serv = new Servlet();
		serv.service(req, rep);
		try {
			rep.pushToClient(code);//推送到客户端
		} catch (IOException e) {
			e.printStackTrace();
		}
		CloseUtil.closeSocket(client);
	}
}
