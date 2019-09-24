package linkscount;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://www.qaclickacademy.com/practice.php");

		// 1. Give the link counts in the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("LinksCount in the webpage: " + links.size());

		// 2. Get the links count in the footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limiting webdriver's scope

		System.out.println("Footer links count: " + footerdriver.findElements(By.tagName("a")).size());

		// 3. Get link count of first column in footer section
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("First footer column link count: " + columndriver.findElements(By.tagName("a")).size());

		// 4. click on each link in the column and check if the pages are opening
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(2000);
		} // opens all the tabs

		Set<String> titles = driver.getWindowHandles();
		Iterator<String> it = titles.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		driver.quit();

	}

}
