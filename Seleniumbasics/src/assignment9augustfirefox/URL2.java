package assignment9augustfirefox;


		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

		public class URL2 {

			public static void main(String[] args) {
				//launch the browser
				String currentWorkingDir=System.getProperty("user.dir");
				String chromeExePath=currentWorkingDir+"\\Executable\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver",chromeExePath);
				WebDriver d=new FirefoxDriver();
				d.get("https://demo.automationtesting.in/Register.html");
				// print page title and validate it
				String pageTitle=d.getTitle();
				String expectedTitle="Register";
				//validation
				System.out.println("print page title validation:"+pageTitle.equals(expectedTitle));
				//print page URL and validate it
				String pageUrl=d.getCurrentUrl();
				String expectedUrl="https://demo.automationtesting.in/Register.html";
				//validation
				System.out.println("print page validation:"+pageUrl.equals(expectedUrl));
				//get page source  and print its length
				String pagesource=d.getPageSource();
				System.out.println("print lenght of page source:"+pagesource.length());
				d.close();

		}

		}
