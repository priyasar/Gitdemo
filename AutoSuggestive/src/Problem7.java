import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem7 {

	public static void main(String[] args) {
		int i =0;
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.findElement(By.id("fromPlaceName")).sendKeys("Bengaluru");
		String script = " return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		while(!text.equalsIgnoreCase("Bengaluru AirpoRT"))
		{
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			i++;
			if(i>10)
			{
			break;
			}
			}
		if(i>10)
		System.out.println("Location Not found");
		else
			System.out.println(text);

	}

}
