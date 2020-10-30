package cn.takovh.javaBasic.c_08_Thread.producerConsuner.printAB;


public class PrintAB {
    public static int i = 0;
    public static Object O = new Object();

    public static void main(String[] args) throws Exception {
        Thread a = new Thread(new A(), "producer");
        Thread b = new Thread(new B(), "consumer");
        a.start();
        b.start();
    }
}

class A implements Runnable {

    @Override
    public void run() {
        int s = 10;
        while (s>0) {
            synchronized (PrintAB.O) {
                if (PrintAB.i == 0) {
                    System.out.print("A");
                    PrintAB.i++;
                    s--;
                    PrintAB.O.notify();
                } else {
                    try {
                        PrintAB.O.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class B implements Runnable {

    @Override
    public void run() {
        int s = 10;
        while (s>0) {
            synchronized (PrintAB.O) {
                if (PrintAB.i == 1) {
                    System.out.print("B");
                    PrintAB.i--;
                    s--;
                    PrintAB.O.notify();
                } else {
                    try {
                        PrintAB.O.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
