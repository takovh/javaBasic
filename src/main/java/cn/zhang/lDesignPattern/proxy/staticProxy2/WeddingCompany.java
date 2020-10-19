package cn.zhang.lDesignPattern.proxy.staticProxy2;

/**
 * 代理角色
 */
public class WeddingCompany implements Marry{
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
