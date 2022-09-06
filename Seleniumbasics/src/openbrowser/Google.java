package openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		//launch the browser
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExePath);
		WebDriver d=new ChromeDriver();
		//open the google home page
		d.get("https://www.google.com");
		//fetch the current url of current web page and print it on console
		String webpageUrl=d.getCurrentUrl();
		System.out.println("current webpage Url:"+webpageUrl);
		//fetch page source content web page
		String webPagesource=d.getPageSource();
		//close program
		d.close();
	}
	}
