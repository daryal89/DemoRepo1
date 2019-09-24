package testng;

import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void webLogin() {
		System.out.println("webLogin--  Hello there !! This is a webLogin test");
	}

	@Test(groups= {"SmokeTest"})
	public void webLogin1() {
		System.out.println("webLogin2-- Hello there !! This is a webLogin test");
	}

	@Test
	public void webLogin2() {
		System.out.println("webLogin3-- Hello there !! This is a webLogin test");
	}

	@Test
	public void webLogin3() {
		System.out.println("webLogin4-- Hello there !! This is a webLogin test");
	}
	
	@Test
	public void carLoan() {
		System.out.println("carLoan1-- Hello there !! This is a carLoan test");
	}

	@Test
	public void carLoan1() {
		System.out.println("carLoan2-- Hello there !! This is a carLoan test");
	}
}
