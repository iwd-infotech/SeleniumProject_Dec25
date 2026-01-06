package test;

import org.testng.annotations.Test;

public class TestCasesDemo {
	
	@Test (priority = 1)
	public void login() {
		System.out.println("Login Test Cases");
	}
	
	@Test (priority = 3)
	public void address() {
		System.out.println("address Test Cases");
	}
	
	@Test (priority = 2)
	public void dashbord() {
		System.out.println("dashbord Test Cases");
	}
	
	@Test (priority = 4)
	public void payment() {
		System.out.println("payment Test Cases");
	}

}
