package kuchBI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_view_date1"));
		Thread.sleep(2000l);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"))	;	
		
	}

	

}
