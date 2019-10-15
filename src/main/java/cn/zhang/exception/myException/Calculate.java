package cn.zhang.exception.myException;

public class Calculate {
	int div(int a,int b) throws FuShuException{
        if(b<0) {
        	//手动通过throw关键字抛出一个自定义异常对象。
            throw new FuShuException("出现了除数是负数的情况",b);
        }
        return a/b;
    }
}
