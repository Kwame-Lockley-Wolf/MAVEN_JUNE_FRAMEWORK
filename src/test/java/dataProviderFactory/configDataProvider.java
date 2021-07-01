//what does this file (configDataProvider)do? 
// it will get information FROM the (config.properties) file. 
// it gets the browser and the stagingURL

package dataProviderFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configDataProvider {

	Properties pro;
	
	public configDataProvider() throws FileNotFoundException, IOException {
		
		pro = new Properties();
		pro.load(new FileInputStream(new File(System.getProperty("user.dir") + "/configs/config.properties")));
	}
	
	public String getstagingURL() {
		return pro.getProperty("stagingURL");
	}
	public String getbroswer() {
		return pro.getProperty("browser");
	}

}




