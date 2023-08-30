package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class configReader {

	public static Properties getPropertyObject() throws FileNotFoundException {
		FileInputStream fp = new FileInputStream(name :"\\Cucumber\\config\\config.properties");
		Properties prop = new Properties();
		prop.load(fp);
		return prop;
		
	}
	
	public static String getUrl() throws IOException
	{
		return getPropertyObject().getProperty("url");
		
	}
	public static String getUsername() throws IOException {
		return getPropertyObject().getProperty("userName");
	}
	
	public static String getPassword() throws FileNotFoundException{
		return getPropertyObject().getProperty("Password");
	}
}

