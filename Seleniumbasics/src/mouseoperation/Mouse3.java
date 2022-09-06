package mouseoperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse3 {

	public static void main(String[] args) {
		String chromeexepath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeexepath);
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/dragmdrop/");
        
	}

}
