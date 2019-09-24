package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@AfterTest
	public void afterTest() {
		System.out.println("I'll execute after every folder");
	}

	@Test
	public void logout() {
		System.out.println("I will logout form the webpage");
	}

	@Test
	public void start() {
		System.out.println("I will start the session!!!");
	}

	@BeforeMethod
	public void bmethod() {
		System.out.println("I will execute before every method in a class");
	}

	@AfterMethod
	public void aemthod() {
		System.out.println("I will execute after every method in a class");
	}

	@Test
	public void login() {
		System.out.println("Login successfully");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Execute at the first of suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I'll execute before every folder");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Execute at the last of suite");
	}

	@BeforeClass
	public void bclass() {
		System.out.println("I'll execute before every class in a folder");
	}

	@AfterClass
	public void aclass() {
		System.out.println("I'll execute after every class in a folder");
	}

}
