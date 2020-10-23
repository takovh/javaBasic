package cn.zhang.aBasic;

public class Basic {

    /**
     * 编译错时因为语法不正确，
     * 报异常有时候是程序自身的错误
     */
    public void testDef(){
        Integer i = null;
        System.out.println(i+1);
    }

    /**
     * x++与++x的区别
     * ++x: x先自增，再将自增后的x代入计算
     * x++: 先将x代入计算，待本行命令结束后再自增
     */
    public void testPlusPlus(){
        int x = 0;
        System.out.println(x++); //0
        System.out.println(x); //1
        System.out.println(++x); //2
        System.out.println(x); //2
        int y = 0 + x++;
        System.out.println(y); //2
        System.out.println(x); //3
    }
    public void testPlusPlus2(){
        int i = 5;
        int result = i++ + ++i + i*10;
        System.out.println("result:" + result); //82
        System.out.println("i:" + i); //7
    }

    public void testPlusEqual(){
        int i = 5;
        i += i + 5;
        System.out.println(i);
    }


    public void testFor(){
        for (int i = 0; i < 5; i++) {
        }
    }

    public void testTryCatch() throws Exception {
        int j = 0;
        for (int i = 0; i < 5; i++){
            j = i;
            if (i == 2) throw new Exception("eee");
        }
        System.out.println(j);
    }

    /**
     * switch case 语句有如下规则：
     * switch 语句中的变量类型可以是： byte、short、int 或者 char。
     * case 标签必须为字符串常量或字面量。
     * 当变量的值与 case 语句的值相等时，case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
     * case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
     */
    public void testSwitch(){
        int i = 2;
        switch (i) {
            case 1:
                System.out.println(i);
                break;
            case 2:
                System.out.println(i);
            default:
                System.out.println(i);
        }
    }


    public static void main(String[] args) {
        Basic b = new Basic();
        try {
            b.testTryCatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}