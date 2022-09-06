package assignment9augustfirefox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URL1 {

	public static void main(String[] args) {
		//launch the browser
				String currentWorkingDir=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
				
				System.setProperty("webdriver.gecko.driver",currentWorkingDir);
				WebDriver d=new FirefoxDriver();
				d.get("https://opensource-demo.orangehrmlive.com/");
				// print page title and validate it
				String pageTitle=d.getTitle();
				String expectedTitle="OrangeHRM";
				System.out.println("actutal title"+pageTitle);
				System.out.println("expected title:"+expectedTitle);
				//validation
				System.out.println("print page title validation:"+pageTitle.equals(expectedTitle));
				//print page URL and validate it
				String pageUrl=d.getCurrentUrl();
				String expectedUrl="https://opensource-demo.orangehrmlive.com/";
				System.out.println("actual url"+pageUrl);
				System.out.println("expected url:"+expectedUrl);
				//validation
				System.out.println("print page validation:"+pageUrl.equals(expectedUrl));
				//get page source  and print its length
				String pagesource=d.getPageSource();
				System.out.println("print lenght of page source:"+pagesource.length());
				//d.close();

	}

}
