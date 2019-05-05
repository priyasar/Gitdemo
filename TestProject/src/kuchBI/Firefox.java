package kuchBI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.gecko.driver","");
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriverwin64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	
	
	}

}
