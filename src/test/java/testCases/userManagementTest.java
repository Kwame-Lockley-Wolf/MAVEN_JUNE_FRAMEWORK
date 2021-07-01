package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BaseClass;
import pages.Login;
import pages.UserManagement;

public class userManagementTest extends BaseClass{
	
	Login login; 
	UserManagement user;
	
  @Test (description = "Testing the User Add User Button", priority=0)
  public void UMTest() {
	  login = PageFactory.initElements(driver, Login.class);
	  user = PageFactory.initElements(driver, UserManagement.class);
	  
	  logger = report.createTest("User Management Test");
	  
	  login.enterUserName("admin");
	  logger.info("user entered userName");
	  
	  login.enterPassword("admin123");
	  logger.info("user entered password");
	  
	  login.clickLoginButton();
	  logger.info("user clicked the login button");
	  
	  user.ValidatePage();
	  logger.pass("User Validated site");
	  
	  user.clickUserTab();
	  logger.info("user hovered and clicked user tab");
	  
	  user.clickAddButton();
	  logger.info("user clicked the add button");
  }
}
