package test;

import org.testng.annotations.Test;

public class EnableAndDisable {
	
  @Test (enabled = true)
  public void firstTestCase() {
	  System.out.println("First TestCase");
  }
  
  @Test (enabled = true)
  public void secondTestCase() {
	  System.out.println("Second TestCase");
  }
  
  @Test (enabled = true)
  public void thirdTestCase() {
	  System.out.println("Third TestCase");
  }
  
  @Test (enabled = false)
  public void fourthTestCase() {
	  System.out.println("Fourth TestCase");
  }
  
  @Test (enabled = true)
  public void fifthTestCase() {
	  System.out.println("Fifth TestCase");
  }
  
}
