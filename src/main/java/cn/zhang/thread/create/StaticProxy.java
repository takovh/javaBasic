package cn.zhang.thread.create;

/**
 * 静态代理设计模式
 * 1.真实角色
 * 2.代理角色
 * 3.二者实现相同的接口
 * @author tako_
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		//创建真实角色
		You you = new You();
		//创建代理角色 + 真实角色的引用
		WeddingCompany wc = new WeddingCompany(you);
		//执行任务
		wc.marry();
	}
	
}

//共同的接口
interface Marry{
	public abstract void marry();
}

//真实角色
class You implements Marry{
	@Override
	public void marry() {
		System.out.println("张煜和周家慧结婚了！");
	}
}

//代理角色
class WeddingCompany implements Marry{
	private Marry you;
	public WeddingCompany() {}
	public WeddingCompany(Marry you) {
		this.you = you;
	}
	private void before() {
		System.out.println("布置新房...");
	}
	private void after() {
		System.out.println("闹洞房...");
	}
	@Override
	public void marry() {
		before();
		you.marry();
		after();
	}
	
}



