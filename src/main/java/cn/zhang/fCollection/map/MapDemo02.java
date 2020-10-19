package cn.zhang.fCollection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 分拣存储：1:N
 * 统计单词出现的次数
 * this is a cat and that is a mice and where is the food ?
 * 
 * 思路：
 * 1.分割字符串
 * 2.分拣存储
 * 3.按要求查看单词出现的次数
 * 4.加入面向对象
 * @author tako_
 *
 */
public class MapDemo02 {
	public static void main(String[] args) {
		//1.分割字符串
		String[] arr = "this is a cat and that is a mice and where is the food ?".split(" ");
		//2.分拣存储
		Map<String, Letter> map = new HashMap<String, Letter>();
		for(String key : arr) {
			if(!map.containsKey(key)) {
				map.put(key, new Letter(key));
			}
			Letter value = map.get(key);
			value.setCount(value.getCount()+1);
		}
		//3.按要求查看单词出现的次数
		for(String key : map.keySet()) {
			Letter value = map.get(key);
			System.out.println(key + "--->" + value.getCount());
		}
	}
}
