import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector(".chNavIcon.appendBottom2.chSprite.chHotels")).click();
		Thread.sleep(1000l);
		//driver.findElement(By.xpath("//*[@id='fromCity']")).clear();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Allahabad");
		Thread.sleep(3000l);
		String s =" return document.getElementById(\"fromCity\").value;";
		String script = (String) js.executeScript(s);
		System.out.println(script);
		
		// WebDriverWait wait = new WebDriverWait(driver,5);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Chandni
		// Chowk, New Delhi And NCR, India']")));

		//driver.findElement(By.xpath("//span[contains(text(),'Chandni Chowk, New Delhi And NCR, India']")).click();
		/*
		 * while(!driver.findElement(By.cssSelector(
		 * "[class='datepicker-days'][class='datepicker-switch']")).getText().contains(
		 * "July")) { driver.findElement(By.
		 * xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).
		 * click(); } List<WebElement> dates= driver.findElements(By.className("day"));
		 * //Grab common attribute//Put into list and iterate int
		 * count=driver.findElements(By.className("day")).size();
		 * 
		 * for(int i=0;i<count;i++) { String
		 * text=driver.findElements(By.className("day")).get(i).getText();
		 * if(text.equalsIgnoreCase("21")) {
		 * driver.findElements(By.className("day")).get(i).click(); break; } }
		 */
		//driver.findElement(By.id("hsw_search_button")).click();
	}
}