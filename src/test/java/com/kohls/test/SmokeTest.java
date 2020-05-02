package com.kohls.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
@Listeners(ListenToMyTestCases.class)
public class SmokeTest extends BaseTest {
	
	HomePage homepage;

	@Test()
	public void homePageloader() {
		
		//extentTest = extent.startTest("homePageloader");

		homepage = new HomePage(driver);
		homepage.verifyLogo();
		//logger.info("logo is Kohl's");
		homepage.veifyurl();
		//logger.info("verifyed the url");

	}

}
