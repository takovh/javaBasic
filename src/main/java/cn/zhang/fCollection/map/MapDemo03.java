package cn.zhang.fCollection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 定义一个Student类，属性：name姓名，no班号，score成绩
 * 现在将若干个Student对象放入List，请统计出每个班级的总分和平均分
 * 方案：面向对象+分拣存储(1:N)
 * @author tako_
 *
 */
public class MapDemo03 {
	public static void main(String[] args) {
		//1.考试
		List<Student> stuList = exam();
		//2.分析成绩
		Map<String, ClassRoom> map = count(stuList);
		//3.查看成绩（总分、平均分）
		view(map);
	}
	
	/**
	 * 查看每个班的总分和平均分 -->遍历map
	 */
	public static void view(Map<String, ClassRoom> map) {
		Set<String> keys = map.keySet();
		Iterator<String> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			String no = keysIt.next();
			ClassRoom room = map.get(no);
			double total = room.getTotal();
			double avg = total/room.getStuList().size();
			System.out.println("班级no:" + no + " 总分：" + total + " 平均分：" + avg);
		}
	}
	
	/**
	 * 统计分析
	 * 1.面向对象
	 * 2.分拣存储
	 */
	public static Map<String, ClassRoom> count(List<Student> list){
		Map<String, ClassRoom> map = new HashMap<String, ClassRoom>();
		//1.遍历List
		for(Student stu : list) {
			String no = stu.getNo();
			double score = stu.getScore();
			ClassRoom room = map.get(no);
			if(null==room) {
				room = new ClassRoom(no);
				map.put(no, room);
			}
			room.getStuList().add(stu);
			room.setTotal(room.getTotal()+score);
		}
		return map;
	}
	
	/**
	 * 模拟考试 测试数据到List中
	 */
	public static List<Student> exam(){
		List<Student> list = new ArrayList<Student>();
		//存放学生成绩
		list.add(new Student("张煜","a",100));
		list.add(new Student("尹杰","a",90));
		list.add(new Student("李险贵","b",80));
		list.add(new Student("王浩","b",85));
		return list;
	}
}
