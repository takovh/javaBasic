package cn.takovh.javaBasic.c_05_Exception;

public class Calculate {
	static int div(int a,int b) throws FuShuException{
        if(b<0) {
        	//手动通过throw关键字抛出一个自定义异常对象。
            throw new FuShuException("出现了除数是负数的情况",b);
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
            int x = Calculate.div(4, -1);
            System.out.println("4/-1=:"+x);
        } catch (FuShuException e) {
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("错误的负是："+e.getValue());
        } finally {
            System.out.println("over");
        }
    }
}
