package assignment10august;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browseroperation {

	public static void main(String[] args) {
		String chromexepath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromexepath);
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//maximize
		driver.manage().window().maximize();
		//minimize
		driver.manage().window().setSize(new Dimension(450,600));
		//maximize
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement s=driver.findElement(By.className("orangehrm-login-forgot-header"));
		s.click();
		System.out.println("forget your password  page url"+driver.getCurrentUrl());
		//want to com back to previous page
		driver.navigate().back();
		System.out.println("login page url"+driver.getCurrentUrl());
		//go bck to next page again
		driver.navigate().forward();
		System.out.println("forget your password  page url"+driver.getCurrentUrl());
		
		//want to refresh page
		driver.navigate().refresh();
		//want to move other url
		driver.navigate().to("https://www.google.com");
		
		

	}

}
