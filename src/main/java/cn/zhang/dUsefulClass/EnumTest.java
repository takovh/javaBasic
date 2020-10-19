package cn.zhang.dUsefulClass;

public class EnumTest {
    public static void main(String[] args) {
        //遍历所有的枚举
        for( Color color : Color.values()){
            System.out.println( color + "  name: " + color.getName() + "  index: " + color.getIndex() );
        }
    }
}

enum MyDay {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY

}

enum Color {

    RED("红色", 1),
    GREEN("绿色", 2),
    WHITE("白色", 3),
    YELLOW("黄色", 4);


    private String name ;
    private int index ;

    private Color( String name , int index ){
        this.name = name ;
        this.index = index ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }


}

////反编译Day.class
//final class Day extends Enum {
//    //编译器为我们添加的静态的values()方法
//    public static Day[] values() {
//        return (Day[])$VALUES.clone();
//    }
//
//    //编译器为我们添加的静态的valueOf()方法，注意间接调用了Enum也类的valueOf方法
//    public static Day valueOf(String s) {
//        return (Day)Enum.valueOf(Day.class, s);
//    }
//
//    //私有构造函数
//    protected Day(String s, int i) {
//        super(s, i);
//    }
//    //前面定义的7种枚举实例
//    public static final Day MONDAY;
//    public static final Day TUESDAY;
//    public static final Day WEDNESDAY;
//    public static final Day THURSDAY;
//    public static final Day FRIDAY;
//    public static final Day SATURDAY;
//    public static final Day SUNDAY;
//    private static final Day $VALUES[];
//
//    static
//    {
//        //实例化枚举实例
//        MONDAY = new Day("MONDAY", 0);
//        TUESDAY = new Day("TUESDAY", 1);
//        WEDNESDAY = new Day("WEDNESDAY", 2);
//        THURSDAY = new Day("THURSDAY", 3);
//        FRIDAY = new Day("FRIDAY", 4);
//        SATURDAY = new Day("SATURDAY", 5);
//        SUNDAY = new Day("SUNDAY", 6);
//        $VALUES = (new Day[] {
//                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        });
//    }
//}