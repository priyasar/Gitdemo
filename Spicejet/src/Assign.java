import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Assign {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//book flight from delhi to varanasi
		driver.findElement(By.xpath("//a[contains(text(),'Delhi (DEL)')]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Varanasi (VNS)')]")).click();
		//booking date is July 3
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains("July"))
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
		int count =driver.findElements(By.cssSelector(".ui-state-default")).size();
		for( int i=0;i<count;i++)
		{
			String name=driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			if(name.equalsIgnoreCase("3"))
			{
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
				break;
			}
		}
	//	book for 5 adults
		driver.findElement(By.id("divpaxinfo")).click();
		for( int i=0; i<4;i++)
		{driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		//choose USD currency
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		driver.findElement(By.xpath("//option[@value='USD']")).click();
		//check box friends and family
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000l);
	}	
	}


