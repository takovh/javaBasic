package cn.zhang.bOOP.constructor;

public class Base {
    static {
        System.out.println("Base static1");
    }

    public Base() {
        System.out.println("Base Construct");
    }

    static {
        System.out.println("Base static2");
    }
}

class Test extends Base {
    static {
        System.out.println("Test static1");
    }

    public Test() {
        System.out.println("Test Construct");
    }

    static {
        System.out.println("Test static2");
    }
}

/**
 * 在执行开始，先要寻找到main方法，因为main方法是程序的入口，
 * 但是在执行main方法之前，必须先加载Test类，而在加载Test类的时候发现Test类继承自Base类，
 * 因此会转去先加载Base类，在加载Base类的时候，发现有static块，便执行了static块。
 * 在Base类加载完成之后，便继续加载Test类，然后发现Test类中也有static块，便执行static块。
 * 在加载完所需的类之后，便开始执行main方法。在main方法中执行new Test()的时候会先调用父类的构造器，
 * 然后再调用自身的构造器。
 *
 * 打印
 * Base static1
 * Base static2
 * Test static1
 * Test static2
 * Base Construct
 * Test Construct
 */
class Main {
    public static void main(String[] args) {
        Base b = new Test();
    }
}
