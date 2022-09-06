package assignment10august;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {


	public static void main(String[] args) {
		String chromeexepath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeexepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https:www.gsmarena.com/samsung-phones-9.php");
		///////////////
		List<WebElement>devicenames=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
		System.out.println("Device count"+devicenames.size());
		////////////////////
		for(int i=0;i<devicenames.size();i++) {
		
	System.out.println("device names"+devicenames.get(i).getText());
		}
		driver.close();
	}
}
