package test;

import org.testng.annotations.Test;

public class GroupingConcept {
	
  @Test (groups = {"smoke"})
  public void testCaseOne() {
	  System.out.println("Smoke Testing");
  }
  
  @Test (groups = {"regression"})
  public void testCaseTwo() {
	  System.out.println("Regression Testing");
  }
  
  @Test (groups = {"smoke"})
  public void testCaseThree() {
	  System.out.println("Smoke Testing");
  }
  
  @Test (groups = {"smoke", "regression"})
  public void testCaseFour() {
	  System.out.println("Smoke Testing & Regreession TEsting");
  }
  
  @Test (groups = {"regression"})
  public void testCaseFive() {
	  System.out.println("Regression Testing");
  }
  
}
