package genX;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Genext {
	WebDriver driver;
		// TODO Auto-generated method stub
		@BeforeTest
		public void method1()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/hotels/");
		}
		@Test
		public void test() throws InterruptedException, AWTException
		{int i=0;
		do {
		driver.findElement(By.xpath("//*[@id=\"city\"]")).click();
		driver.findElement(By.xpath("//*[@placeholder='Enter city/ Hotel/ Area/ Building']")).sendKeys("Agra");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		}while(i<10);
		}

		}