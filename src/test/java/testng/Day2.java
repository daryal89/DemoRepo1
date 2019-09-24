package testng;

import org.testng.annotations.Test;

public class Day2 {

	@Test(groups= {"SmokeTest"})
	public void ploan() {
		System.out.println("loan1--  Hello there !! This is a testng test");
	}

	@Test
	public void ploan1() {
		System.out.println("loan2-- Hello there !! This is a testng test");
	}

	@Test
	public void ploan2() {
		System.out.println("loan3-- Hello there !! This is a testng test");
	}

	@Test
	public void ploan3() {
		System.out.println("loan4-- Hello there !! This is a testng test");
	}
}
