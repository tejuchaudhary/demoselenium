package assignment10august;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatfire2 {

	public static void main(String[] args) {
		//open the browser
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",chromeExePath);
		FirefoxDriver d=new FirefoxDriver();
		//enter the url
		d.get("https://demo.actitime.com/login.do");
		//identify the username field
		WebElement username=d.findElement(By.id("username"));
		//perform opertaion in the username field
		username.clear();
		username.sendKeys("admin");
		//identify password field
		WebElement pwd=d.findElement(By.name("pwd"));
		//perform opertaion in the username field
		pwd.clear();
		pwd.sendKeys("manager");
		//identify password field
		WebElement signinButton=d.findElement(By.tagName("a"));
		//perform opertaion in the sign in field
			signinButton.click();
			//d.close();		
		
	}
}
		