package cn.takovh.javaBasic.c_08_Thread.e_00_threadBasic.callable;

import java.util.concurrent.Callable;

public class Race implements Callable<Integer> {
    private String name;//名称
    private long time;//延时
    private int step = 0;//步
    private boolean flag = true;
    public Race() {}
    public Race(String name) {
        super();
        this.name = name;
    }
    public Race(String name, long time) {
        super();
        this.name = name;
        this.time = time;
    }
    @Override
    public Integer call() throws Exception {
        while(flag) {
            Thread.sleep(time);//延时
            step++;
        }
        return step;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    public int getStep() {
        return step;
    }
    public void setStep(int step) {
        this.step = step;
    }
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
