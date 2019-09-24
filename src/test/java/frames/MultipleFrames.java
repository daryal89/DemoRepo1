package frames;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//size of frame finding
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println("Size of frame: "+frames.size());

		// switching to the top frame
		driver.switchTo().frame("frame-top");

		// switching to the middle frame
		driver.switchTo().frame("frame-middle");

		// printing the text in the middle frame
		System.out.println(driver.findElement(By.id("content")).getText());

		// switching back to the main window
		driver.switchTo().defaultContent();

		driver.close();
	}
}
