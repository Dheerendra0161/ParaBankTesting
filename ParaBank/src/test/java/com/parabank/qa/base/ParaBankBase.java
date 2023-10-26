package com.parabank.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBankBase {
	WebDriver driver;
	public Properties prop;
	public static Properties dataProp;

	public ParaBankBase() throws IOException {

		prop = new Properties();
		File file = new File(
				"C:\\Users\\DHEERENDRA\\eclipse-workspace\\ParaBank\\src\\main\\java\\com\\parabank\\qa\\config\\config.properties");

		FileInputStream fis = new FileInputStream(file);

		prop.load(fis);

		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\DHEERENDRA\\eclipse-workspace\\ParaBank\\src\\main\\java\\com\\parabank\\qa\\testdata\\testdata.properties");

		dataProp = new Properties();

		dataProp.load(fis1);

	}

	public WebDriver BrowserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
