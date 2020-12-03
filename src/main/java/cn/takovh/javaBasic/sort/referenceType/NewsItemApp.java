package cn.takovh.javaBasic.c_16_algorithm.sort.referenceType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 使用Collections
 * @author tako_
 *
 */
public class NewsItemApp {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("李险贵脱单了！！！",100,new Date()));
		news.add(new NewsItem("尹杰脱单了！！！",200,new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("李险贵开腔了！！！",90,new Date(System.currentTimeMillis()-1000*60*60)));
		System.out.println("排序前：\n"+news);
		
		Collections.sort(news);
		System.out.println("排序后：\n"+news);
	}
}
