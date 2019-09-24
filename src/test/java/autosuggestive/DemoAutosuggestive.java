package autosuggestive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutosuggestive {

	public static void main(String[] args) throws InterruptedException {

		// in https://www.ksrtc.in website
		// 1. Enter the letters BENG
		// 2. Verify if Airport optionis displayed in the suggestive box

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.ksrtc.in");

		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		// driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());// will not extract the text inside the
																					// textbox because if is hidden
																					// element

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;"; // in javascript we use return to
																					// put the value in the String
		String text = (String) js.executeScript(script);
		System.out.println(text); // will print the text in the edit box

		// bengaluru international airport
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(text);
			System.out.println(text);
		}

		driver.close();
	}

}
