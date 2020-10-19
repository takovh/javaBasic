package cn.zhang.dUsefulClass.Integer;
/**
 * 测试包装类的基本用法
 * @author 张煜
 *
 */
public class TestInt {
	public static void main(String[] args) {
		Integer [] i = new Integer[4];
		i[0] = new Integer(100);//过时了,但是不影响使用
		i[1] = 101;
		i[2] = Integer.parseInt("102");
		i[3] = new Integer("103");//过时了,但是不影响使用
		for(Integer m : i) {
			System.out.println(m);
			System.out.println(m.intValue());
		}
	}
}
