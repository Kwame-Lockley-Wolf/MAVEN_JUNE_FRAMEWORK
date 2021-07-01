package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.utility;

public class AutomationSite {
	WebDriver driver;
	public AutomationSite(WebDriver d) {
		this.driver = d;
}
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a") WebElement signInButton; 
	@FindBy(id="email_create") WebElement emailAddressField;
	@FindBy(xpath = "//button[@id= 'SubmitCreate']") WebElement creatAccountButton;
	@FindBy(id="uniform-id_gender1") WebElement titleRadioButton;
	@FindBy(id="customer_firstname")WebElement firstNameField;
	@FindBy(id="customer_lastname") WebElement lastNameField ; 
	@FindBy(xpath = "//input[@id='email']") WebElement emailField ;
	@FindBy(xpath = "//input[@id='passwd']") WebElement passwordField;
	@FindBy(xpath = "//*[@id=\"days\"]/option[20]") WebElement dobDaysDropDown ;
	
	@FindBy(xpath = "//input[@id='firstname']") WebElement firstNameField2  ;
	@FindBy(xpath = "//input[@id='lastname']") WebElement  lastNameField2;
	@FindBy(xpath = "//*[@id=\"company\"]"  ) WebElement  companyField;
	@FindBy(xpath = "//*[@id=\"address1\"]") WebElement  addressField;
	@FindBy(xpath = "//*[@id=\"address2\"]") WebElement  addressField2;
	@FindBy(xpath = "//*[@id=\"city\"]") WebElement cityField;
	@FindBy(xpath = "//*[@id=\"id_state\"]/option[34]") WebElement stateDropdown;
	@FindBy(xpath = "//*[@id=\"postcode\"]") WebElement zipcodeField;
	
	@FindBy(xpath = "//button[@id='submitAccount']") WebElement  registerButton;
	
	public void ValidatePage() {
		utility.validateTitle(driver, "    ");
		}





}