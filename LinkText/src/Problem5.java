import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver = footerdriver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[1]/ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));

			Thread.sleep(3000l);
		}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}
}
