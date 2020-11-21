package cn.takovh.javaBasic.c_01_basic;

public class BasicType {
    public static void main(String[] args) {
        BasicType test = new BasicType();
        test.testShortType();
    }

    public void testShortType(){
        short s = 1;
        s = (short)(s + 1);
        System.out.println(s);
    }

}
