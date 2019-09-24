package testng;

import org.testng.annotations.Test;

public class Day1 {

	@Test(groups= {"SmokeTest"})
	public void demo() {
		System.out.println("Test1--  Hello there !! This is a testng test");
	}

	@Test
	public void demo1() {
		System.out.println("Test2-- Hello there !! This is a testng test");
	}

	@Test
	public void demo2() {
		System.out.println("Test3-- Hello there !! This is a testng test");
	}

	@Test
	public void demo3() {
		System.out.println("Test4-- Hello there !! This is a testng test");
	}
}
