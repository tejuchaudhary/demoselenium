package assignment10august;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatfirefox {

	public static void main(String[] args) {
		//open the browser
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",chromeExePath);
		WebDriver d=new FirefoxDriver();
		//enter the url
		d.get("https://opensource-demo.orangehrmlive.com/");
		//identify the username field
		WebElement username=d.findElement(By.id("txtUsername"));
		//perform opertaion in the username field
		username.clear();
		username.sendKeys("Admin");
		//identify password field
		WebElement pwd=d.findElement(By.name("txtPassword"));
		//perform opertaion in the username field
		pwd.clear();
		pwd.sendKeys("admin123");
		//identify password field
		WebElement signinButton=d.findElement(By.className("button"));
		//perform opertaion in the sign in field
			signinButton.click();
			//d.close();		
		
	}
}
		