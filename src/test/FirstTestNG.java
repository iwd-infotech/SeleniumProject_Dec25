package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {
	WebDriver driver;

	@Test (priority = 1)
	public void testLogout() {
		System.out.println("Logout Test Cases");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
	}

	@Test (priority = 2)
	public void testLogin() {
		System.out.println("Login Test Cases");
		driver.findElement(By.id("username")).sendKeys("student");
	}

}
