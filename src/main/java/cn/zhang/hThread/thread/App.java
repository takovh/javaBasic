package cn.zhang.hThread.thread;

/**
 * 线程1：继承Thread类
 * 模拟龟兔赛跑
 * 1.创建多线程 继承Tread + 重写run(线程体)
 * 2.使用线程：创建子类对象 + 对象.start()线程启动
 * @author tako_
 *
 */
public class App {
    public static void main(String[] args) {
        //1.创建子类对象
        Rabbite rbt = new Rabbite();
        Tortoise tts = new Tortoise();
        //2.调用start方法
        rbt.start();
        tts.start();
    }
}
