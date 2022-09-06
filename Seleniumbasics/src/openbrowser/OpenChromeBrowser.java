package openbrowser;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChromeBrowser {

		public static void main(String[] args) {
			/**
			 * Step1: set the path of required browser executable file using System.setProperty(key, value)
			 * Step2: create an instance of required browser class
			 */
			System.setProperty("webdriver.chrome.driver",
					"D:\\WORKSPACE  ECLIPSE\\thiskeyword\\java\\Seleniumbasics\\Executable\\chromedriver.exe");
			ChromeDriver t=new ChromeDriver();
			t.get("https://www.google.com");
		    t.close();
	}
}

