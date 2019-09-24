package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements testNG listeners
public class Listerners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure: " + result.getName());

		// screenshot code will go here
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestStart");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");

	}

}
