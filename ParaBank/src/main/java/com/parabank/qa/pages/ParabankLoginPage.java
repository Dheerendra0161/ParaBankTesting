package com.parabank.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParabankLoginPage {
	
WebDriver driver;
	@FindBy(xpath = "//p[@class='smallText']")
	private WebElement WelcomeToAccountServices;
	
	public ParabankLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean AccountServicesText() {
		boolean welcome = WelcomeToAccountServices.isDisplayed();
		return welcome;
	}
	
	
	
	

}
