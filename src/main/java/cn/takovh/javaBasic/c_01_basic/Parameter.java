package cn.takovh.javaBasic.c_01_basic;

/**
 * 总结：
 * Java中只有值传递，没有引用传递。
 * 值传递的精髓是：传递的是存储单元中的内容，而非地址或者引用！
 *
 * 这跟变量是类的成员变量还是方法的局部变量无关
 * 但是，被传参的函数内部可以改变传入的变量本身的内容
 * 如List可以list.add(),
 * 但String不能像List一样，提供改变自身内容的方法（或类成员public），则只能通过返回值来改变引用。
 */
public class Parameter {
    int i = 0;
    String s = "a";
    String[] ss = {"0"};

    /**
     * 输出
     * 0
     * 0
     */
    public void addInt(){
        int i = 0;
        addInt(i);
        addInt(this.i);
        System.out.println(i);
        System.out.println(this.i);
    }
    private void addInt(int i){
        i++;
    }

    /**
     * 输出
     * a
     * a
     * ab
     */
    public void addStr(){
        String s = "a";
        addStr(s);
        addStr(this.s);
        System.out.println(s);
        System.out.println(this.s);
        s = addStrr(s);
        System.out.println(s);
    }
    private void addStr(String s){
        s += "b";
    }
    private String addStrr(String s){
        s += "b";
        return s;
    }


    /**
     * 输出
     * 01
     * 01
     */
    public void addArr(){
        String[] ss = {"0"};
        addArr(ss);
        addArr(this.ss);
        System.out.println(ss[0]);
        System.out.println(this.ss[0]);
    }
    private void addArr(String[] s){
        s[0] += "1";
    }


    public static void main(String[] args) {
        Parameter p = new Parameter();
        p.addStr();
    }
}
