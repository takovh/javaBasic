package cn.takovh.javaBasic.c_04_usefulClass;

public class WrapperClass {
    //byte(位)   -2^7 - 2^7-1
    public byte b;

    //short(短整数)    -2^15 - 2^15-1
    public short s;

    //int(整数)   -2^31 - 2^31-1
    public int i;

    //long(长整数) -2^63 - 2^63-1
    public long l;

    //float(单精度)    1.4E-45 - 3.4028235E38
    public float f;

    //double(双精度)   4.9E-324 - 1.7976931348623157E308
    public double d;

    //char(字符)
    public char c;

    //boolean(布尔值)  -128 - 127
    public boolean bool;

    public void test(){
        b = 127;
        s = 32767;
        i = 2147483647;
        l = 9223372036854775807L;
        f = 10.0F;
        d = 10.0D;
        c = 'c';
        bool = true;
        System.out.println(""+b+s+i+l+",float:"+f+",double:"+d+c+bool);
    }

    public void printInfo(){
        System.out.println("byte的大小："+Byte.SIZE
                +";默认值："+b
                +";数据范围："+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);

        System.out.println("short的大小："+Short.SIZE
                +";默认值："+s
                +";数据范围："+Short.MIN_VALUE+" - "+Short.MAX_VALUE);

        System.out.println("int的大小："+Integer.SIZE
                +";默认值："+i
                +";数据范围："+Integer.MIN_VALUE+" - "+Integer.MAX_VALUE);

        System.out.println("long的大小："+Long.SIZE
                +";默认值："+l
                +";数据范围："+Long.MIN_VALUE+" - "+Long.MAX_VALUE);

        System.out.println("float的大小："+Float.SIZE
                +";默认值："+f
                +";数据范围："+Float.MIN_VALUE+" - "+Float.MAX_VALUE);

        System.out.println("double的大小："+Double.SIZE
                +";默认值："+d
                +";数据范围："+Double.MIN_VALUE+" - "+Double.MAX_VALUE);

        System.out.println("char的大小："+Character.SIZE
                +";默认值："+c
                +";数据范围："+Character.MIN_VALUE+" - "+Character.MAX_VALUE);

        System.out.println("boolean的大小："+Byte.SIZE
                +";默认值："+bool
                +";数据范围："+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);
    }

    public static void main(String[] args) {
        WrapperClass wrapperClass = new WrapperClass();
        wrapperClass.printInfo();
        wrapperClass.test();
    }
}
