package frames;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com");

		WebElement multipleWindow = driver.findElement(By.linkText("Multiple Windows"));
		multipleWindow.click();

		WebElement clickHere = driver.findElement(By.linkText("Click Here"));
		clickHere.click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			String parentId = it.next();
			String childId = it.next();

			driver.switchTo().window(childId);
			WebElement newWindow = driver.findElement(By.cssSelector("div[class='example'] h3"));
			System.out.println(newWindow.getText());

			driver.switchTo().window(parentId);
			WebElement openingWindow = driver.findElement(By.cssSelector("div[class='example'] h3"));
			System.out.println(openingWindow.getText());

			driver.quit();
		}
	}
}
