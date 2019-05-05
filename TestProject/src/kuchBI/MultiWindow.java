package kuchBI;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//a[contains(text(),'terms and conditions')]")).click();
		System.out.println(driver.getTitle());
		java.util.Set<String> ids= driver.getWindowHandles();
		Iterator<String> i = ids.iterator();
		String parentid = i.next();
		String childid = i.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
	}

}
