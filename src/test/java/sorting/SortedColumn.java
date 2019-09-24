package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortedColumn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionKey");

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//descending
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//Ascending
		List<WebElement> firstCollist = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		// creating an Arraylist

		ArrayList<String> originalList = new ArrayList<String>();
		// Iterator<String>it =originalList.iterator();
		for (int i = 0; i < firstCollist.size(); i++) {
			firstCollist.get(i).getText();
			// System.out.println(firstCollist.get(i).getText());
			originalList.add(firstCollist.get(i).getText());
		}
		System.out.println("--------------original list---------");
		for (String st : originalList) {
			System.out.println(st);
		}

		// copying the arrayList
		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}

		// Sorting the copied list
		System.out.println("--------- Copied List------------");
		Collections.sort(copiedList);// converts in ascending order
		//Collections.reverse(copiedList); //into descending order
		for (String s : copiedList) {
			System.out.println(s);
		}

		Assert.assertTrue(originalList.equals(copiedList));
	}

}
