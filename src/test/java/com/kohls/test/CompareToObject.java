package com.kohls.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListenToMyTestCases.class)
public class CompareToObject extends BaseTest {
	
	
	@Test(enabled=false)
	public void compare() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mdmolla/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.eshopper24.com/");
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl, "https://www.eshopper23.com/");
	}

}
