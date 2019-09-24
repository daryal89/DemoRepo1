package frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println("size of the frame: " + frame.size());

		// driver.switchTo().frame(0); //by frame index
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); // by WebElement
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		// Creating actions class
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();

		// for switching to the normal windows to do operations in the windows
		driver.switchTo().defaultContent();

		driver.close();

	}

}
