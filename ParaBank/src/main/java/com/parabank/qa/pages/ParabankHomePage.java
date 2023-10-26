package com.parabank.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParabankHomePage {
	WebDriver driver;
	ParabankHomePage home;

	@FindBy(xpath = "//*[text()='Register']")
	private WebElement RegisterOption;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement EnterValidUserNameOption;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement EnterValidPasswordOption;
	
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement ClickOnLogin;

	public ParabankHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ParabankRegisterPage ClickOnRegister() {
		RegisterOption.click();
		return new ParabankRegisterPage(driver);

	}
	
	public void clickOnLogin(String userName,String passWord) {
		EnterValidUserNameOption.sendKeys(userName);
		EnterValidPasswordOption.sendKeys(passWord);
		ClickOnLogin.click();
		//return ParabankLoginPage(driver);
	}

}
