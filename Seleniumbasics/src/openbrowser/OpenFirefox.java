package openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		//absolut path
				String driverPath1="D:\\WORKSPACE  ECLIPSE\\thiskeyword\\java\\Seleniumbasics\\Executable\\geckodriver.exe";
		        //relative path
				String driverPath2=".\\Executable\\geckodriver.exe";
				//using system class
				String driverPath3=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
				//set the driver executable path using System.setProperty(string key,string value)
				System.setProperty("webdriver.gecko.driver",driverPath3);
				//create instace of required broweser class
				FirefoxDriver c= new FirefoxDriver();
				c.get("https:www.google.com");
				c.close();	
			}

		}
