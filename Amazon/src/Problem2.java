import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Problem2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Actions a = new Actions(driver);
		String username="dephones59@gmail.com";
		String password="19p11*1992";
		//Signing in to account
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
				a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).build().perform();
				driver.findElement(By.xpath("//a[@data-nav-ref='nav_signin']//span")).click();
				driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys(username);
				driver.findElement(By.className("a-button-input")).submit();
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.xpath("//span[contains(text(),'Login')]")).submit();

	}

}
