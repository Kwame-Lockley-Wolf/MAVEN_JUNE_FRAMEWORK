package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProviderFactory.DataProviderFactory;
import helper.BaseClass;
import pages.Login;
import pages.Logout;

public class LoginTest extends BaseClass {
	
	Login login; 
	Logout logout;
	
	
  @Test (description = "login to OrangeHRM", priority = 0)
  public void LoginHRM() {
	  
	  login = PageFactory.initElements(driver, Login.class); 
	  logout = PageFactory.initElements(driver, Logout.class);
	  
	  logger = report.createTest("Login Test for OrangeHRM");
	  
	  login.ValidateHomePage();
	  logger.pass("Home Page Validated");
	  login.enterUserName("Admin");
	  logger.info("Username entered");
	  login.enterPassword("admin123");
	  logger.info("Password entered");
	  login.clickLoginButton();
	  logger.info("clicked on ogin button");
		  
	  logout.clickLogout();
	System.out.println("LOG INFO: Clicked on logout button");
  }
  @Test(dataProvider = "Sheet1", description = "login to orangeHRM using excel", priority = 1)
  public void LoginHRMExcel(String Uname, String Pass) {
	  
	  login = PageFactory.initElements(driver, Login.class); 
	  logout = PageFactory.initElements(driver, Logout.class);
	  
	  logger = report.createTest("Login Test for OrangeHRM");
	  
	  login.ValidateHomePage();
	  logger.pass("Home Page Validated");
	  login.enterUserName(Uname);
	  logger.info("Username entered");
	  login.enterPassword(Pass);
	  logger.info("Password entered");
	  login.clickLoginButton();
	  logger.info("clicked on ogin button");
		  
	  logout.clickLogout();
	System.out.println("LOG INFO: Clicked on logout button");
  }
  
  @DataProvider(name = "Sheet1")
  public Object[][] getDataFromSources() throws FileNotFoundException, IOException{
	  System.out.println("LOG INFO: running Data Provider first to generate data");
	  int rows = DataProviderFactory.getExcel().getRows("Sheet1");	  
	  int columns = DataProviderFactory.getExcel().getColumns("Sheet1");
	  System.out.println("Total number of rows: " + rows);
	  System.out.println("Total number of columns: " + columns);
	  
	  Object[][] arr = new Object[rows - 1][columns]; 
	  for (int i=0; i<rows-1; i++) {
		  for(int j=0; j<columns; j++) {
			  arr[i][j] = DataProviderFactory.getExcel().getCellData( "Sheet1",  i+1,  j);
		  }
	  }
	  System.out.println("LOG INFO: Data Provider is ready to use");
	  return arr;
  }
}
