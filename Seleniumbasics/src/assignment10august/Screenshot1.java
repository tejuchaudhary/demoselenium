package assignment10august;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		String chromeexepath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeexepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https:www.gsmarena.com/samsung-phones-9.php");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot,new File(".\\Screenshot.png"));
	}

}
