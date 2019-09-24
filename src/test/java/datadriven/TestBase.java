package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

	public WebDriver driver = null;

	// Opening the browser
	@Test
	public void logIn() throws IOException {

		File file = new File(".\\datadriven.properties");

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);

		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("apikey"));

		if (prop.getProperty("browser").contains("chrome")) {

			driver = new ChromeDriver();

		} else if (prop.getProperty("browser").contains("firefox")) {

			driver = new FirefoxDriver();
		} else {

			System.setProperty("webdriver.edge.driver",".//msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.get(prop.getProperty("url"));

	}

}
