package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import helper.BaseClass;
import helper.utility;

public class UserManagement extends BaseClass {
	WebDriver driver;
		public UserManagement(WebDriver d) {
			this.driver = d;
		}
		@FindBy(id="menu_admin_viewAdminModule") WebElement adminTab; 
		@FindBy(id="menu_admin_UserManagement") WebElement managementTab;
		@FindBy(id = "menu_admin_viewSystemUsers") WebElement usersTab;
		@FindBy(id = "btnAdd") WebElement addButton;
	
		public void ValidatePage() {
		utility.validateTitle(driver, "OrangeHRM");
		}
		
		public void clickUserTab() {
			Actions action = new Actions(driver);
			action.moveToElement(adminTab).build().perform();
			action.moveToElement(managementTab).build().perform();
			utility.waitForWebElement(driver, usersTab).click();
			System.out.println("LOG INFO: User clicked on User button");
		}
		public void clickAddButton() {
			utility.waitForWebElement(driver, addButton).click();
			System.out.println("LOG INFO: clicked on Add Button");
		}
}
