package test;

import org.testng.annotations.Test;

public class DependsOnMethods_Concept {
	
	// End to End Testing
	  @Test 
	  public void loginTestCase() {
		  System.out.println("Login TestCase");
	  }
	  
	  @Test (dependsOnMethods = "loginTestCase")
	  public void landingPageTestCase() {   // Failed
		  System.out.println("Landing TestCase");
	  }
	  
	  @Test (dependsOnMethods = "landingPageTestCase")
	  public void productPageTestCase() {
		  System.out.println("Product TestCase");
	  }
	  
	  @Test (dependsOnMethods = "productPageTestCase")
	  public void addressPageTestCase() {
		  System.out.println("Address TestCase");
	  }
	  
	  @Test (dependsOnMethods = "addressPageTestCase")
	  public void paymentPageTestCase() {
		  System.out.println("Payment TestCase");
	  }

}
