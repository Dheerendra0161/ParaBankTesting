package com.parabank.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParabankRegisterPage {
	public WebDriver driver;

	@FindBy(id = "customer.firstName")
	private WebElement firstName;

	@FindBy(id = "customer.lastName")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='customer.address.street']")
	private WebElement streetAdress;

	@FindBy(id = "customer.address.city")
	private WebElement cityName;

	@FindBy(id = "customer.address.state")
	private WebElement stateName;

	@FindBy(id = "customer.address.zipCode")
	private WebElement zipCode;

	@FindBy(id = "customer.phoneNumber")
	private WebElement phoneNo;

	@FindBy(id = "customer.ssn")
	private WebElement ssnNum;

	@FindBy(id = "customer.username")
	private WebElement userName;

	@FindBy(id = "customer.password")
	private WebElement passWord;

	@FindBy(id = "repeatedPassword")
	private WebElement RepeatedPassWord;

	@FindBy(xpath = "//td//input[@value='Register']")
	private WebElement RegisterButton;
	
	@FindBy(xpath = "//span[text()='This username already exists.']")
	private WebElement UserNameExist;
	
	

	public ParabankRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Registration(String first_Name, String last_Name, String street_Adress, String city_Name,
			String state_Name, String zip_Code, String phone_No, String ssn_Num, String user_Name, String pass_Word,
			String Repeated_PassWord) {

		firstName.click();
		firstName.sendKeys(first_Name);
		lastName.sendKeys(last_Name);
		streetAdress.sendKeys(street_Adress);
		cityName.sendKeys(city_Name);
		stateName.sendKeys(state_Name);
		zipCode.sendKeys(zip_Code);
		phoneNo.sendKeys(phone_No);
		ssnNum.sendKeys(ssn_Num);
		userName.sendKeys(user_Name);
		passWord.sendKeys(pass_Word);
		RepeatedPassWord.sendKeys(Repeated_PassWord);
		RegisterButton.click();
		//return new ParabankLoginPage(driver);

	}
	


	public String existing_UserName_Message() {
		String UserName_Exist =UserNameExist.getText();
		return UserName_Exist;
	}

}
