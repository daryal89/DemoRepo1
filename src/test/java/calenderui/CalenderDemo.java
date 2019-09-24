package calenderui;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");

		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.path2usa.com/travel-companions");

		// provide the date September 23
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		boolean boo = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September 2019");

		while (!boo)
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click(); // next instead of 'prev' if date displayed for next year date 
		}

		List<WebElement> dates = driver.findElements(By.className("day"));

		int count = driver.findElements(By.className("day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();

			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		// driver.close();
	}

}
