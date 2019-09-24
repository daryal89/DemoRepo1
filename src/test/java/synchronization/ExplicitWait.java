package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.geck.driver", "C:\\Users\\creat\\eclipse-workspace\\Collection\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("h-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromdate")).sendKeys(Keys.ENTER);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,15);
	//	wait.until(ExpectedConditionsvisibliliyOfElementLocated("locator"));
		
		
		// driver.close();
	}

}
