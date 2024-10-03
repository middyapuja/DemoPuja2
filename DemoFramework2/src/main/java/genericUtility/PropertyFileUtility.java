package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	/**
	 * This method is used to read data from Property file provided key
	 * @param key
	 * @return
	 * @throws IOException
	 */
  public String toReadDataFromPropertyfile(String key) throws IOException {
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commondata.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String value = prop.getProperty(key);
	return value;
	
   }
}
