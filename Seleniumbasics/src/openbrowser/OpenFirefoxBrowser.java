package openbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\WORKSPACE  ECLIPSE\\thiskeyword\\java\\Seleniumbasics\\Executable\\geckodriver.exe");
		FirefoxDriver h=new FirefoxDriver();
		h.get("https://www.google.com");
		h.close();

	}

}
