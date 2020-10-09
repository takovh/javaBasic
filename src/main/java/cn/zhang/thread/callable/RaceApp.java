package cn.zhang.thread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RaceApp {
    /**
     * 线程2：使用Callable创建线程
     * Executors.newFixedThreadPool(nThreads)
     * @author tako_
     *
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //创建线程
        ExecutorService ser = Executors.newFixedThreadPool(2);
        Race tortoise = new Race("乌龟",1000);
        Race rabbit = new Race("兔子",500);
        //获取值
        Future<Integer> result1 = ser.submit(tortoise);
        Future<Integer> result2 = ser.submit(rabbit);

        Thread.sleep(5000);//5秒
        tortoise.setFlag(false);//停止线程体循环
        rabbit.setFlag(false);//停止线程体循环

        int num1 = result1.get();
        int num2 = result2.get();
        System.out.println("乌龟跑了-->" + num1 + "步");
        System.out.println("兔子跑了-->" + num2 + "步");
        //停止服务
        ser.shutdownNow();
    }
}
