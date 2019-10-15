package cn.zhang.exception.myException;

public class Demo {
	public static void main(String[] args) {
		Calculate c = new Calculate();
        try {
            int x = c.div(4, -1);
            System.out.println("4/-1=:"+x);
        }catch (FuShuException e) {
        	e.printStackTrace();
//            System.out.println(e.toString());
            System.out.println("错误的负是："+e.getValue());
        }
        System.out.println("over");
    }
}
