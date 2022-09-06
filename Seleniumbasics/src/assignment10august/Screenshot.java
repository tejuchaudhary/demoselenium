package assignment10august;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

		public static void main(String[] args) throws IOException 
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\WORKSPACE  ECLIPSE\\thiskeyword\\java\\Seleniumbasics\\Executable\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com");
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File screenShot=ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("D:\\WORKSPACE  ECLIPSE\\thiskeyword\\java\\Seleniumbasics\\Screenshot\\Screenshot2.png");
			FileUtils.copyFile(screenShot,destFile);
	}
}