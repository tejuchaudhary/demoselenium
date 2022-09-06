package assignment10august;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		//define implicit wait for browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//identify username field
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("User name is displayed or not? "+userNameInputField.isDisplayed());
		System.out.println("User name is functional or not? "+userNameInputField.isEnabled());
		
		String defaultValueInUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default value of user name input field: "+defaultValueInUserNameInputField);
		System.out.println("Default value validation for user name input field status: "+defaultValueInUserNameInputField.equals("Username"));
		//password fileld
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		System.out.println("User name is displayed or not? "+passwordInputField.isDisplayed());
		System.out.println("User name is functional or not? "+passwordInputField.isEnabled());
		
		String defaultvaluepasswordInputField=passwordInputField.getAttribute("placeholder");
		System.out.println("Default value of user name input field: "+defaultvaluepasswordInputField);
		System.out.println("Default value validation for user name input field status: "+defaultvaluepasswordInputField.equals("Password"));
		//login button
		WebElement loginbuttonInputField=driver.findElement(By.id("loginButton"));
		System.out.println("User name is displayed or not? "+loginbuttonInputField.isDisplayed());
		System.out.println("User name is functional or not? "+loginbuttonInputField.isEnabled());
		
		String defaultvalueloginbuttonInputField=loginbuttonInputField.getAttribute("id");
		System.out.println("Default value of user name input field: "+defaultvalueloginbuttonInputField);
		System.out.println("Default value validation for user name input field status: "+defaultvalueloginbuttonInputField.equals("loginButton"));
		//check  box
		WebElement checkboxInputField=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("User name is displayed or not? "+checkboxInputField.isDisplayed());
		System.out.println("User name is functional or not? "+checkboxInputField.isEnabled());
		
		String defaultvaluechackboxInputField=checkboxInputField.getAttribute("name");
		System.out.println("Default value of user name input field: "+defaultvaluechackboxInputField);
		System.out.println("Default value validation for user name input field status: "+defaultvaluechackboxInputField.equals("remember"));
		
	}
	

}
