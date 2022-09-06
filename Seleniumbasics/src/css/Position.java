package css;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		Point locationOfErrorMsg=errorMsg.getLocation();
		System.out.println("Error msg:"+errorMsg.getText());
		System.out.println("Error msg text color:"+errorMsg.getCssValue("color"));
		int errorMsgX=locationOfErrorMsg.getX();
		int errorMsgY=locationOfErrorMsg.getY();
		System.out.println("errorMsgX:"+errorMsgX);
		System.out.println("errorMsgY:"+errorMsgY);
		WebElement usernameinputfield=driver.findElement(By.id("username"));
	    Point locationofuserinputfield=usernameinputfield.getLocation();
	    int userinputfieldX=locationofuserinputfield.getX();
	    int userinputfieldY=locationofuserinputfield.getY();
	    System.out.println("userinputfieldX:"+userinputfieldX);
	    System.out.println("userinputfieldY:"+userinputfieldY);
	    int passwordfieldX=driver.findElement(By.name("pwd")).getLocation().getY();
	    int passwordfieldY=driver.findElement(By.name("pwd")).getLocation().getX();
	    System.out.println("passwordfieldX:"+passwordfieldX);
	    System.out.println("passwordfieldY:"+passwordfieldY);
	    System.out.println("is eerror msg get display above username:"+)
	}
}
