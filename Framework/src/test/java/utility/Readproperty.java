package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readproperty {
	
	
	Properties pro;
	
	public Readproperty() throws Exception {
		
		File f=new File("./config/config.properties");
		
		FileInputStream fi=new FileInputStream(f);
		
		pro=new Properties();
		
		pro.load(fi);
	}

	public String getSearchValue(String search) {
		 return pro.getProperty(search);
	}
	
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String getURL() {
		
		return pro.getProperty("url");
	}
}
