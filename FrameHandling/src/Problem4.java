import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Problem4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		a.dragAndDrop(src, dest).build().perform();;
		
	}

}
