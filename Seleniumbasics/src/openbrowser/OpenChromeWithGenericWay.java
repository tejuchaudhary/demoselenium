package openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeWithGenericWay {

	public static void main(String[] args) {
		//absolut path
				String driverPath1="D:\\WORKSPACE  ECLIPSE\\thiskeyword\\java\\Seleniumbasics\\Executable\\chromedriver.exe";
		        //relative path
				String driverPath2=".\\Executable\\chromedriver.exe";
				//using system class
				String driverPath3=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
				//set the driver executable path using System.setProperty(string key,string value)
				System.setProperty("webdriver.chrome.driver",driverPath3);
				//create instace of required broweser class
				WebDriver c= new ChromeDriver();
				c.get("https:www.google.com");
				c.close();	
			}

		}
