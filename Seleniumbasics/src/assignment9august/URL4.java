package assignment9august;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL4 {

	public static void main(String[] args) {
		//launch the browser
				String currentWorkingDir=System.getProperty("user.dir");
				String chromeExePath=currentWorkingDir+"\\Executable\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",chromeExePath);
				WebDriver d=new ChromeDriver();
				d.get("https://www.amazon.in/");
				// print page title and validate it
						String pageTitle=d.getTitle();
						String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
				//validation
						System.out.println("print page title validation:"+pageTitle.equals(expectedTitle));
				//print page URL and validate it
						String pageUrl=d.getCurrentUrl();
						String expectedUrl="https://www.amazon.in/";
				//validation
						System.out.println("print page validation:"+pageUrl.equals(expectedUrl));
				//get page source  and print its length
						String pagesource=d.getPageSource();
						System.out.println("print lenght of page source:"+pagesource.length());
						d.close();

				}

				}
