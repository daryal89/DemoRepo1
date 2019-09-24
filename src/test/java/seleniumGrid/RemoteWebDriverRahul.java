package seleniumGrid;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverRahul {
	// protected ThreadLocal<RemoteWebDriver> threadDriver = null;

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver;

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);

		/*
		 * capabilities.setCapability(FirefoxDriver.BINARY, new
		 * File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath
		 * ());
		 */

		driver = new RemoteWebDriver(new URL("http://192.168.28.1:4445/wd/hub"), capabilities);

		driver.get("http://amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}
}
