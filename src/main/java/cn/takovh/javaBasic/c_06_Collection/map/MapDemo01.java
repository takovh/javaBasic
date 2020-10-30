package cn.takovh.javaBasic.c_06_Collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 分拣存储：1:N
 * 统计单词出现的次数
 * this is a cat and that is a mice and where is the food ?
 * 
 * 思路：
 * 1.分割字符串
 * 2.分拣存储
 * 3.按要求查看单词出现的次数
 * 
 * @author tako_
 *
 */
public class MapDemo01 {
	public static void main(String[] args) {
		//1.分割字符串
		String[] arr = "this is a cat and that is a mice and where is the food ?".split(" ");
		//2.分拣存储
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String key : arr) {
			//System.out.println(key);
			if(!map.containsKey(key)) {
				map.put(key, 1);
			}else {//已经存在
				map.put(key, map.get(key)+1);
			}
		}
		//3.按要求查看单词出现的次数
		Set<String> keySet = map.keySet();
		//获取对象
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "-->" + value);
		}
	}
}
