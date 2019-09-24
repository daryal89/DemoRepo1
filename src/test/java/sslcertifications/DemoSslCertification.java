package sslcertifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DemoSslCertification {

	public static void main(String[] args) {

		// ssl certifications -- chrome --> proceed anyway, your connection is
		// private,security certificate is not trusted!

		// Desired Capabilities

		// general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();

		// acceptInsecureCerts
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		// belongs to your local browser --> chromeOptions is used to set chrome browser setting
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);

	}

}
