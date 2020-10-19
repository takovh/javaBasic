package cn.zhang.jServer.demo01;

import java.io.Closeable;
import java.io.IOException;

/**
 * 工具类关闭流
 * 可变参数： ... 只能放在形参的最后一个位置,处理方式与数组一致
 * @author tako_
 *
 */
public class CloseUtil {
	public static void closeIO(Closeable ... io) {
		for(Closeable temp:io) {
			if(null!=temp) {
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void closeSocket(Closeable ... Socket) {
		for(Closeable temp:Socket) {
			if(null!=temp) {
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void closeall(Closeable ... io) {
		for(Closeable temp:io) {
			if(null!=temp) {
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
