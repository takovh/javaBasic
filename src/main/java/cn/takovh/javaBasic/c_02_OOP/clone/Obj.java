package cn.takovh.javaBasic.c_02_OOP.clone;

import java.util.Date;

public class Obj implements Cloneable {
    private Date birth = new Date();

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void changeDate() {
        this.birth.setTime(0L);
    }

    @Override
    protected Object clone() {
        Obj o = null;
        try {
            o = (Obj)super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        // 实现深复制
        o.setBirth((Date) this.getBirth().clone());
        return o;
    }

    public static void main(String[] args) {
        Obj a = new Obj();
        Obj b = (Obj)a.clone();
        b.changeDate();
        System.out.println(a.getBirth());
        System.out.println(b.getBirth());
    }
}
