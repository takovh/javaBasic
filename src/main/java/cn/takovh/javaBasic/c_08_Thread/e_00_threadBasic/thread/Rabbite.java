package cn.takovh.javaBasic.c_08_Thread.e_00_threadBasic.thread;

public class Rabbite extends Thread {
    @Override
    public void run() {
        //线程体
        for(int i=0;i<100;i++) {
            System.out.println("兔子跑了" + i + "步");
        }
    }
}
