package kuchBI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 
public class endtoend {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Return date callender disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Return date calender enabled");
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000l);
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.print("No. of travellers:");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		driver.findElement(By.xpath("//option[contains(@value,'USD')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	}

}
