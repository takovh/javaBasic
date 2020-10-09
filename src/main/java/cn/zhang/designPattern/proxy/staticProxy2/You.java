package cn.zhang.designPattern.proxy.staticProxy2;

/**
 * 真实角色
 */
public class You implements Marry{
    @Override
    public void marry() {
        System.out.println("你和女神结婚了！");
    }

}
