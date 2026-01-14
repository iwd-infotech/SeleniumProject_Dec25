package assertt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	
	@Test
	public void assertt() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());

	System.out.println("Browser Launch");  // logging
	WebElement userName_Textbox = driver.findElement(By.id("username"));
	userName_Textbox.clear();
	userName_Textbox.sendKeys("student");

	WebElement pass_Textbox = driver.findElement(By.name("password"));
	pass_Textbox.clear();
	pass_Textbox.sendKeys("Password123");

	WebElement submit_Button = driver.findElement(By.id("submit"));
	submit_Button.click();
	
	Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation", "Title not matched");
	
	}

}
