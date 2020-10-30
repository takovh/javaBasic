package cn.takovh.javaBasic.c_10_server.demo01;

public class Servlet {
	public void service(Request req, Response rep) {
		rep.println("<html><head><title>HTTP响应示例</title></head><body>");
		rep.println("欢迎：").println(req.getParameter("uname")).println("回来了！");
		rep.println("</body></html>");
	}
}
