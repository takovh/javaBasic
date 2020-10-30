package cn.takovh.javaBasic.c_12_designPattern.proxy.staticProxy2;

/**
 * 静态代理设计模式
 * 1.真实角色
 * 2.代理角色
 * 3.二者实现相同的接口
 * @author tako_
 *
 */
public class App {
    public static void main(String[] args) {
        //创建真实角色
        You you = new You();
        //创建代理角色 + 真实角色的引用
        WeddingCompany wc = new WeddingCompany(you);
        //执行任务
        wc.marry();
    }
}
