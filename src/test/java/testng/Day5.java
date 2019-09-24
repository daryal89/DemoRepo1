package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Day5 {

	@Parameters("URL")
	@Test(groups = "RegressionTest")
	public void register(String URL) {
		System.out.println("register to the application: " + URL);
	}

	@Parameters("username")
	@Test(groups = { "SmokeTest" })
	public void login(String un) {
		System.out.println("login into the application: " + un);
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = { "login" }, enabled = true) // this test dependsOn login method if login method fails it
															// will skipped
	public void start() {
		System.out.println("start the system");
	}

	@Test(timeOut = 1000) // test case will wait for 1sec before throwing timeOut exception
	public void logout() {
		System.out.println(" Logout from the system");
	}

	@Test(priority = 0)
	public void removeFromDb() {
		System.out.println("Removing form database");
	}

	@Test(enabled = true) // this test case will be skipped
	public void aptLoan1() {
		System.out.println("apartment loan !!!");
	}

	@Test(dataProvider = "getData")
	public void loginApp(String un, String pw) {
		System.out.println("Application login: ");
		System.out.println("Username: " + un + "  Password: " + pw);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[4][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";

		data[1][0] = "secondsetusername";
		data[1][1] = "secondsetpassword";

		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetpassword";

		data[3][0] = "forthsetusername";
		data[3][1] = "forthsetpassword";
		return data;
	}

	/*
	 * @BeforeSuite public void bsuite() { System.out.println("BeforeSuite"); }
	 * 
	 * @BeforeMethod public void bMethod() {
	 * System.out.println("Before each method"); }
	 * 
	 * @AfterMethod public void aMethod() { System.out.println("After each method");
	 * }
	 * 
	 * @AfterClass public void aClass() { System.out.println("After every class"); }
	 * 
	 * @BeforeClass public void bClass() { System.out.println("Before every class");
	 * }
	 */
}
