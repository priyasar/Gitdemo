import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.cssSelector(".mTxt")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid= it.next();
			String childid= it.next();
				driver.switchTo().window(childid);
				System.out.println(driver.getTitle());
				driver.switchTo().window(parentid);
				System.out.println(driver.getCurrentUrl());
				
		
	}

}
