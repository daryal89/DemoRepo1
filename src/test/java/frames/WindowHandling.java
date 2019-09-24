package frames;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup");
		WebElement help = driver.findElement(By.xpath("//*[@id=\'initialView\']/footer/ul/li[1]/a"));
		WebElement privacy = driver.findElement(By.xpath("//*[@id=\'initialView\']/footer/ul/li[2]/a"));
		WebElement terms = driver.findElement(By.xpath("//*[@id=\'initialView\']/footer/ul/li[3]/a"));
		help.click();
		privacy.click();
		terms.click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			String parentId = it.next();
			String child1Id = it.next();
			String child2Id = it.next();
			String child3Id = it.next();

			//parent title
			System.out.println(driver.getTitle());

			//child title
			driver.switchTo().window(child1Id);
			System.out.println(driver.getTitle());

			//child title
			driver.switchTo().window(child2Id);
			System.out.println(driver.getTitle());

			//child title
			driver.switchTo().window(child3Id);
			System.out.println(driver.getTitle());

			//parent title
			driver.switchTo().window(parentId);
			System.out.println(driver.getTitle());
		}
	}

}
