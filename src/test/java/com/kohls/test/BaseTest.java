package com.kohls.test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ReadPropFile;

public class BaseTest {

	public static WebDriver driver;
	public Properties prop;

	
	@BeforeMethod
	public void open1() throws IOException {

	

		prop = ReadPropFile.ReadFile("/Users/mdmolla/eclipse-workspace/AframeWork/config.properties");

		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mdmolla/Downloads/chromedriver");
			driver = new ChromeDriver();
		
		} else if (browser.equals("FireFox")) {
			System.setProperty("webdriver.geko.driver", "");
			driver = new FirefoxDriver();

		} else if (browser.equals("IE")) {
			System.setProperty("webdriver.InternetExplorar.driver", "");
			driver = new InternetExplorerDriver();

		} else if (browser.equals("Edge")) {
			System.setProperty("webdriver.Edge.driver", "");
			driver = new EdgeDriver();

		} else if (browser.equals("Opera")) {
			System.setProperty("webdriver.Opera.driver", "");
			driver = new OperaDriver();

		} else if (browser.equals("safari")) {
			System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
			driver = new SafariDriver();
		}


		driver.get(prop.getProperty("url"));
	

	}
	
	

	@AfterMethod
	public void closeBrowser(ITestResult result) throws InterruptedException, IOException {

		Thread.sleep(5000);
		driver.quit();
		// logger.info("browser has been closed");

	}

}
