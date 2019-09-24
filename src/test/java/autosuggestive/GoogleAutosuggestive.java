package autosuggestive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutosuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
		System.out.println((driver.findElement(By.name("q")).getText()));

		// Javascript DOM can extract hidden elements
		// because selenium cannot identify hidden elements - (Ajax implementation)
		// investigate the properties of object if it have any hidden text

		// JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementByName(\"q\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		// finding
		while (!text.equalsIgnoreCase("hello molly")) {
			i++;
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.DOWN);

			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) {
				break;
			}

		}

		if (i > 10) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element  found");
		}

	}

}
