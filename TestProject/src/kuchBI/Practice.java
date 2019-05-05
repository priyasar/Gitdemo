package kuchBI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		int n= columndriver.findElements(By.tagName("a")).size();
		for(int i=0; i<n;i++)
		{
			String clk = Keys.chord(Keys.CONTROL,Keys.ENTER);
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clk);;
		Thread.sleep(2000l);
		
		}
		java.util.Set<String> ids= driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while(it.hasNext())
		{driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		}
	}

}
