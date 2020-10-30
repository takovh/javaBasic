package cn.takovh.javaBasic.sort.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 模拟扑克牌游戏
 * 1.binarySearch​(List<? extends Comparable<? super T>> list, T key) 容器有序
 * 2.sort​(List<T> list)
 *   sort​(List<T> list, Comparator<? super T> c)
 * 3.reverse​(List<?> list)
 * 4.shuffle​(List<?> list) 洗牌
 * 5.swap​(List<?> list, int i, int j)
 * @author tako_
 *
 */
public class CollectionsDemo01 {
	//反转
	public static void test01() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("反转之后：");
		System.out.println(list);
	}
	public static void main(String[] args) {
		//test01();
		List<Integer> cards = new ArrayList<Integer>();
		//shuffle洗牌，模拟扑克牌游戏
		for(int i=0;i<54;i++) cards.add(i);
		//洗牌
		Collections.shuffle(cards);
		//依次发牌
		List<Integer> p1 = new ArrayList<Integer>();//玩家1
		List<Integer> p2 = new ArrayList<Integer>();//玩家2
		List<Integer> p3 = new ArrayList<Integer>();//玩家3
		List<Integer> last = new ArrayList<Integer>();//底牌
		{
			int i;
			for (i = 0; i < 51; i += 3) {
				p1.add(cards.get(i));
				p2.add(cards.get(i + 1));
				p3.add(cards.get(i + 2));
			}
			for ( ; i < 54; i++) last.add(cards.get(i));
		}
		System.out.println("player1:"+p1);
		System.out.println("player2:"+p2);
		System.out.println("player3:"+p3);
		System.out.println("底牌:"+last);
		
	}
}
