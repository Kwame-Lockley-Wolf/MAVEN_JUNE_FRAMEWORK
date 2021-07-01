package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserFactory {

	static WebDriver driver;  

	public static WebDriver StartBrowser(String BrowserName, String url) {

		if(BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("WebDriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		
		return driver;
	}
}
