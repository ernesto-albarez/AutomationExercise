import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumhq {
	private static WebDriver driver;

	public static void main(String[] args) {
		// Get instance of Firefox driver
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Go to google home page
		driver.get("https://www.google.com");

		// Type 'Seleniumhq' on the google searchbox and hit enter
		WebElement googleSearchBox = driver.findElement(By.id("lst-ib"));
		googleSearchBox.sendKeys("Seleniumhq", Keys.ENTER);
		
		// Get seleniumhq url and click on it
		WebElement seleniumHQurl = driver.findElement(By.xpath("//*[@id='rso']//h3/a"));
		seleniumHQurl.click();
		
		// Close actual session
		driver.close();
	}
}
