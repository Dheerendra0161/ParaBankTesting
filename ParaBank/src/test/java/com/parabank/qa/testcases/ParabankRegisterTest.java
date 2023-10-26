package com.parabank.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.qa.base.ParaBankBase;
import com.parabank.qa.pages.ParabankHomePage;
import com.parabank.qa.pages.ParabankRegisterPage;
import com.parabank.qa.utils.ParaBankUtilities;

public class ParabankRegisterTest extends ParaBankBase {

	public WebDriver driver;
	ParabankHomePage home;
	ParabankRegisterPage ParabankRegisterPage;
	ParabankRegisterPage prp;
	ParaBankUtilities pbUtilities;

	public ParabankRegisterTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() {

		driver = BrowserLaunch("firefox");
		home = new ParabankHomePage(driver);
		home.ClickOnRegister();
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

	@Test
	public void registeration_With_Allready_Existing_Username() {
		prp = new ParabankRegisterPage(driver);
		prp.Registration(dataProp.getProperty("first_Name"), dataProp.getProperty("last_Name"),
				dataProp.getProperty("street_Adress"), dataProp.getProperty("city_Name"),
				dataProp.getProperty("state_Name"), dataProp.getProperty("zip_Code"),dataProp.getProperty("phone_No")  ,
				dataProp.getProperty("ssn_Num"), dataProp.getProperty("user_Name"), dataProp.getProperty("pass_Word"),
				dataProp.getProperty("Repeated_PassWord"));
		Assert.assertEquals(prp.existing_UserName_Message(), "This username already exists.");

	}

	@Test
	public void registeration_With_New_UserName() {
		prp = new ParabankRegisterPage(driver);
		pbUtilities = new ParaBankUtilities();
		prp.Registration(dataProp.getProperty("first_Name"), dataProp.getProperty("last_Name"),
				dataProp.getProperty("street_Adress"), dataProp.getProperty("city_Name"),
				dataProp.getProperty("state_Name"), dataProp.getProperty("zip_Code"), ParaBankUtilities.generateUniqueMobile(),
				dataProp.getProperty("ssn_Num"), ParaBankUtilities.generateUniqueUsername(),
				dataProp.getProperty("pass_Word"), dataProp.getProperty("Repeated_PassWord"));
		Assert.assertEquals(prp.existing_UserName_Message(), "This username already exists.");
	}

}
