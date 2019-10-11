package cn.zhang.sort.innerType;

import java.util.Comparator;
import java.util.List;


/**
 * 1数组排序
 * 
 * @author tako_
 *
 */
public class Utils {
	/**
	 * 数组排序-降序
	 * @param arr
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sort(Object[] arr) {
		boolean sorted = true;
		int len = arr.length;
		for (int j = 0; j < len - 1; j++) {
			sorted = true;
			for (int i = 0; i < len - 1 - j; i++) {
				if (((Comparable) arr[i]).compareTo(arr[i + 1]) < 0) {
					Object temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
	}
	
	/**
	 * 数组排序-降序(使用泛型)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends Comparable<T>> void sort(T[] arr) {
		boolean sorted = true;
		int len = arr.length;
		for (int j = 0; j < len - 1; j++) {
			sorted = true;
			for (int i = 0; i < len - 1 - j; i++) {
				if (((Comparable) arr[i]).compareTo(arr[i + 1]) < 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
	}
	
	/**
	 * 容器排序
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void sort(List<T> list) {
		//第一步：转成数组
		Object[] arr = list.toArray();
		sort(arr);
		//第二步：改变容器中对应的值
		for(int i=0;i<arr.length;i++) list.set(i, (T)(arr[i]));
	}
	
	/**
	 * 数组的排序（降序）+Comparator接口
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Object[] arr, Comparator com) {
		boolean sorted = true;
		int len = arr.length;
		for (int j = 0; j < len - 1; j++) {
			sorted = true;
			for (int i = 0; i < len - 1 - j; i++) {
				if (com.compare(arr[i], arr[i+1]) < 0) {
					Object temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
	}
}
