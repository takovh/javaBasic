package cn.zhang.sort.referenceType;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 新闻条目的实体类
 * @author tako_
 *
 */
public class NewsItem implements java.lang.Comparable<NewsItem> {
	//标题
	private String title;
	//点击量
	private int hits;
	//时间
	private Date publicTime;
	public String getTitle() {
		return title;
	}
	
		
	public NewsItem() {
		
	}
	
	public NewsItem(String title, int hits, Date publicTime) {
		super();
		this.title = title;
		this.hits = hits;
		this.publicTime = publicTime;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getPublicTime() {
		return publicTime;
	}
	public void setPublicTime(Date publicTime) {
		this.publicTime = publicTime;
	}

	//时间降序+点击量升序+标题降序
	@Override
	public int compareTo(NewsItem o) {
		// TODO Auto-generated method stub
		int result = 0;
		//比较时间
		result = -this.publicTime.compareTo(o.publicTime);//降序
		if(0==result) {//时间相同
			//比较点击量
			result = this.hits - o.hits;//升序
			if(0==result) {//点击量相同
				//比较标题
				result = -this.title.compareTo(o.title);//降序
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("标题：").append(this.title).append(", ");
		sb.append("时间：").append(new SimpleDateFormat("MM-dd HH:mm:ss").format(this.publicTime)).append(", ");
		sb.append("点击量：").append(this.hits).append("\n");
		return sb.toString();
	}
	
}
