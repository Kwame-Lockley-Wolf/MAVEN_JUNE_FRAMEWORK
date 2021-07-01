package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BaseClass;
import helper.utility;

public class Login extends BaseClass{
	
	WebDriver driver;
	public Login(WebDriver d) {
		this.driver = d;
	}
	
@FindBy(id="txtUsername") WebElement username; 
@FindBy(id="txtPassword") WebElement password;
@FindBy(xpath = "//input[@value='LOGIN']") WebElement LoginButton;

public void ValidateHomePage() {
	utility.validateTitle(driver, "OrangeHRM"); 
}
public void enterUserName(String s) {
	System.out.println("LOG INFO: Username entered");
	utility.waitForWebElement(driver, username).sendKeys(s);
}
public void enterPassword(String p) {
	System.out.println("LOG INFO: password entered");
	utility.waitForWebElement(driver, password).sendKeys(p);
}
public void clickLoginButton() {
	utility.waitForWebElement(driver, LoginButton).click();
	System.out.println("LOG INFO: CLicked on login button");
}

}
