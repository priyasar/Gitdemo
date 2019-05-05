package kuchBI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector(".nav-a.nav-a-2"))).build().perform();
		Thread.sleep(2000l);
		a.moveToElement(driver.findElement((By.id("twotabsearchtextbox")))).click().keyDown(Keys.SHIFT)
				.sendKeys("WeirdWolf").build().perform();

	}

}
