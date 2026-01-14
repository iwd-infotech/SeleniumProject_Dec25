package listeners;

import org.testng.ITestListener;
import org.testng.internal.TestResult;

public class MyListener implements ITestListener{
	
//	ITestListnere is an interface provided by TestNG.
	
	public void onTestStart(ITestListener result) {
		System.out.println("Test Started: ");
	}
	
	public void onTestSuccess(ITestListener result) {
		System.out.println("Test Passed: ");
	}
	
	public void onTestFailure(ITestListener result) {
		System.out.println("Test Failure: " );
	}
	
	public void onTestSkipped(ITestListener result) {
		System.out.println("Test Skipped: ");
	}

}
