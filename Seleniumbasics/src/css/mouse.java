package css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		String chromeexepath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeexepath);
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
       WebElement username=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
       username.sendKeys("admin");
       Actions act=new Actions(driver);
       act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
      WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
       act.moveToElement(lastname).doubleClick().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
       //WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	   //act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
	}

}
