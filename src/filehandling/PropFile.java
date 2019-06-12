package filehandling;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropFile {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("demo.properties");
		
		p.setProperty("url", "https://www.totalwine.com/");
		p.setProperty("uname", "mnagaraj@sapient.com");
		p.setProperty("password", "twm1234");
		
		p.store(os, null);
	
	}
}
