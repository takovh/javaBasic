package cn.zhang.IO.pattern;

/**
 * 扩音器
 * 类与类之间的关系
 * 1.依赖：形参|局部变量
 * 2.关联：属性
 * 		聚合：整体与部分 不一致的生命周期，如人与手
 * 		组合：整体与部分 一致的生命周期，如人与大脑
 * 3.继承：父子类关系
 * 4.实现：接口与实现类关系
 * @author tako_
 *
 */
public class App {
	public static void main(String[] args) {
		Voice v = new Voice();
		v.say();
		Amplifier am = new Amplifier(v);
		am.say();
	}
}
