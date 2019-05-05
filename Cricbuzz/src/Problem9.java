import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22487/kxip-vs-kkr-52nd-match-indian-premier-league-2019");
		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));

}
}