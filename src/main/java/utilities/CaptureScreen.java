package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreen {
	
	
	
	public static void capturefailed(WebDriver driver, String testname) {

		// /Users/mdmolla/eclipse-workspace/TestNgwithSelenium/ScreenShotFailTest

		// /Users/mdmolla/eclipse-workspace/TestNgwithSelenium/ScreenShotFailTest

		// "/Users/mdmolla/eclipse-workspace"
		// + "/POMProjectJCP/FaliedTestMethods/"

		String time = currentTime();

		// int num = generateRandomNumber(10);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile,
					new File("/Users/mdmolla/eclipse-workspace/AframeWork/ScreenShotFailTest/" + testname + "_"
							+ time + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	public static String currentTime() {

		DateTimeFormatter dnt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String LocalTime = dnt.format(now);
		return LocalTime;

	}
	public static void failedCaption(WebDriver driver, String testname) {   //this methods works 

		String time = currentTime();

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File desfile = new File("/Users/mdmolla/eclipse-workspace" + "/AframeWork/ScreenShotFailTest/"
				+ testname + "__" + time + ".png");
		try {
			FileUtils.copyFile(screenshotFile, desfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void failedtest(WebDriver driver, String testname) {

		String LocalTime = currentTime();

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("/Users/mdmolla/eclipse-workspace" + "/AframeWork/innovative/"
					+ testname + LocalTime + "------" + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






}
