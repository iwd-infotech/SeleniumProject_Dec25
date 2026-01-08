package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BeforeTestConcept {
	WebDriver driver;

	@Test
	public void loginValidTestCase() {
		WebElement userName_Textbox = driver.findElement(By.id("username"));
		userName_Textbox.sendKeys("student");

		WebElement pass_Textbox = driver.findElement(By.name("password"));
		pass_Textbox.sendKeys("Password123");

		WebElement submit_Button = driver.findElement(By.id("submit"));
		submit_Button.click();
	}

	@Test
	public void logoutTestCase() {

		WebElement logout_Button = driver.findElement(By.linkText("Log out"));
		logout_Button.click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
