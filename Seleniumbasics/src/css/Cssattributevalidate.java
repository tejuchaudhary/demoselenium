package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssattributevalidate {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement signInButton=driver.findElement(By.cssSelector("button[type='submit']"));
		String fontSize=signInButton.getCssValue("font-size");
		String fontColor=signInButton.getCssValue("color");//RGBA format color code
		String fontBackgroundColor=signInButton.getCssValue("background-image");//RGBA format color code
		System.out.println("Font Size: "+fontSize);
		System.out.println("Font color: "+fontColor);
		System.out.println("Font Background Color: "+fontBackgroundColor);
		WebElement forgotPasswordLinkColor=driver.findElement(By.cssSelector(".forgotPasswordLink"));
		String acp=forgotPasswordLinkColor.getCssValue("color");
		System.out.println("forgotPasswordLink color: "+acp);//RGBA format color code
	}

}
