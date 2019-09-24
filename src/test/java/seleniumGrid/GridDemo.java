package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException {

		// DesiredCapabilites class
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setBrowserName("chrome");
		//dc.setBrowserName("firefox");
		dc.setBrowserName("ie");
		dc.setPlatform(Platform.WINDOWS);
		// dc.setVersion(72.0.0);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), dc);
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
