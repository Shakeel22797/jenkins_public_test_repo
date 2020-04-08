package test_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Testng_tests {

	@Test
	public void testing(){
	System.setProperty("webdriver.chrome.driver", ".\\Webdriver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	options.addArguments("disable-infobars");
	WebDriver driver=new ChromeDriver(options);
	String Urls= "https://www.espncricinfo.com/";
	driver.get(Urls);
}
}
