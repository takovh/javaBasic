package cn.zhang;

import java.io.InputStream;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;


/**
 * 读取配置文件中的值
 */
public class GetResources {
	
	private static String BASE_URL;
    static {
        ResourceBundle rb=null;
        try {
            InputStream inputStream = GetResources.class.getResourceAsStream("/db.properties");
            rb = new PropertyResourceBundle(inputStream);
            BASE_URL=rb.getString("mysqlPwd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static String getFilePath(String path){
    	String p = null;
    	try {
			p = GetResources.class.getResource(path).getPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return p;
    }
 
    public static void main(String[] args){
        System.out.println(GetResources.BASE_URL);
        System.out.println(getFilePath("/db.properties"));
    }
}
