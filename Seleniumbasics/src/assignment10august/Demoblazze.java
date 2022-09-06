package assignment10august;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblazze {

	public static void main(String[] args) {
		String chromeexepath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeexepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https:www.demoblaze.com/");
		List<WebElement>devicenames=driver.findElements(By.cssSelector("div>h4>a"));
		List<WebElement>deviceprice=driver.findElements(By.cssSelector("div>.row h5"));
		for(int i=0;i<devicenames.size();i++) {
			System.out.println("device names:"+devicenames.get(i).getText() +": "+"device price:"+deviceprice.get(i).getText());
	}

}
}