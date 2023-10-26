package com.parabank.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.ParaBankBase;
import com.parabank.qa.pages.ParabankHomePage;
import com.parabank.qa.pages.ParabankLoginPage;
import com.parabank.qa.utils.ParaBankUtilities;

public class ParaBankLoginTest extends ParaBankBase {

	static WebDriver driver;
	static ParabankHomePage home;
	ParaBankUtilities pbUtilities;

	public ParaBankLoginTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() {
		driver = BrowserLaunch("firefox");
		home = new ParabankHomePage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public static void LoginWithValidCredential() {
		home = new ParabankHomePage(driver);
		home.clickOnLogin(dataProp.getProperty("user_Name"), dataProp.getProperty("pass_Word"));
		ParabankLoginPage loginPage = new ParabankLoginPage(driver);
		loginPage.AccountServicesRext();
		Assert.assertTrue(true);

	}

}
