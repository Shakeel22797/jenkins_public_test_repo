package test_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import jdk.nashorn.internal.runtime.ECMAException;

public class Testng_tests {

	@Test
	public void testing(){
		System.out.println("Test Started");
	System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver");
	System.out.println("Creating Chrome options object");
	ChromeOptions options = new ChromeOptions();
	System.out.println("adding arguments");
	options.addArguments("start-maximized");
	options.addArguments("disable-infobars");
	options.addArguments("headless");
	System.out.println("Creating driver");
	try {
	WebDriver driver=new ChromeDriver(options);
	System.out.println("Opening Browser");
	String Urls= "https://www.espncricinfo.com/";
		System.out.println("Browser Opening Now");
	driver.get(Urls);
		System.out.println("Browser Opened Successfully");

	}
	catch(Exception e) {
		System.out.println(e);
		
	}
			System.out.println("Test Completed Successfully");

}
}
