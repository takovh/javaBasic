package cn.zhang.net.tcp.chat;

import java.io.Closeable;
import java.io.IOException;

/**
 * 工具类关闭流
 * 可变参数： ... 只能放在形参的最后一个位置,处理方式与数组一致
 * @author tako_
 *
 */
public class CloseUtil {
	public static void close(Closeable ... io) {
		for(Closeable temp:io) {
			if(null!=temp) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
