package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Parameters({ "URL" })

	@Test
	public void homeLoan(String url) {
		System.out.println("homeLoan- This is a homeLoan test" + url);
	}

	@Parameters({ "username" })
	@Test(groups = { "SmokeTest" })
	public void homeLoan1(String username) {
		System.out.println(" This is a homeLoan test: " + username);
	}

	@Parameters({ "password" })
	@Test
	public void homeLoan2(String pw) {
		System.out.println("This is a homeLoan test: " + pw);
	}

	@Test
	public void homeLoan3() {
		System.out.println("homeLoan4-- Hello there !! This is a homeLoan test");
	}

	@Test
	public void aptLoan() {
		System.out.println("aptLoan-- Hello there !! This is a aptLoan test");
	}

	@Test
	public void aptLoan1() {
		System.out.println("aptLoan2-- Hello there !! This is a aptLoan test");
	}
}
