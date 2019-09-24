package datadriven;

import java.io.IOException;

import org.testng.annotations.Test;

public class ChildClass extends TestBase {

	@Test
	public void OpeningBrowser() throws IOException {

		logIn();
	}

	@Test
	public void flightBooking() throws IOException {
		logIn();
		System.out.println("Executing flightbooking");
	}

}
