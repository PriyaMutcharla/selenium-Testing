package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//or it can be used-->import org.openqa.selenium.firefox.*;

/* Three things needed to work on selenium
 * 1.Latest selenium jar file
 * 2.Latest Browser version - FF,chrome,IE,opera,safari
 * 3.Latest browser executable file
 * 
 */

public class TestBrowsers {

	public static void main(String[] args) throws InterruptedException {
		
		//CTRL+SHIFT+O--> to import all the classes
		//System.setProperty("webdriver.gecko.driver", "C:\\Bhagi\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Bhagi\\executable\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("http://way2automation.com");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		driver.close();
		

	}

}
