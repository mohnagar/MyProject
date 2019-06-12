package filehandling;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromPropFile {
	
	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();
		
		InputStream is = new FileInputStream("demo.properties");
		p.load(is);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("password"));
		
		p.list(System.out);
		
	}

}
