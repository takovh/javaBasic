package cn.zhang.sort.innerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("==============String≈≈–Ú===============");
		String[] arr = {"a","abcd","abc","def"};
		Utils.sort(arr);//Ωµ–Ú
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==============List≈≈–Ú===============");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Utils.sort(list);
		System.out.println(list);
		
		System.out.println("============== π”√Comparator≈≈–Ú ˝◊È===============");
		String[] arr2 = {"a","abcd","abc","def"};
		Utils.sort(arr2, new StringCompare());//Ωµ–Ú
		System.out.println(Arrays.toString(arr2));
	}
}
