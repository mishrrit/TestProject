/**
 * 
 */
package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author mishrrit
 *
 */
public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "Conf//Configuration.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getChromeDriverPath(){
		String driverPathChrome = properties.getProperty("driverpathChrome");
		if(driverPathChrome!= null) return driverPathChrome;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public String getFirefoxDriverPath(){
		String driverPathFirefox = properties.getProperty("driverpathFirefox");
		if(driverPathFirefox!= null) return driverPathFirefox;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

}

