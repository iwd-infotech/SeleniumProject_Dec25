package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BeforeMethodAnnotation {

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
	public void loginInvalidTestCase() {
		WebElement userName_Textbox = driver.findElement(By.id("username"));
		userName_Textbox.sendKeys("12334");

		WebElement pass_Textbox = driver.findElement(By.name("password"));
		pass_Textbox.sendKeys("Passwor3");

		WebElement submit_Button = driver.findElement(By.id("submit"));
		submit_Button.click();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

}
