package test;

import org.testng.annotations.Test;

public class PriorityInMethods {

	@Test (priority = -3)
	public void loginTestCase() {
		System.out.println("-3 Login TestCase");
	}

	@Test (priority = 1)
	public void landingPageTestCase() {  
		System.out.println("1 Landing TestCase");
	}

	@Test (priority = 0)
	public void productPageTestCase() {
		System.out.println("0 Product TestCase");
	}

	@Test (priority = 0)
	public void addressPageTestCase() {
		System.out.println("2 Address TestCase");
	}

	@Test (priority = 3)
	public void paymentPageTestCase() {
		System.out.println("3 Payment TestCase");
	}

}
