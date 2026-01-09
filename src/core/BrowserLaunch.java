package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		String actual_Title = "Logged In Successfully | Practice Test Automation";
		
		// Browser Launch 
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.id("username")).sendKeys("student");  - this is not a good practice.
//		Locators: 1. id
		WebElement userName_Textbox = driver.findElement(By.id("username"));
		userName_Textbox.clear();
		userName_Textbox.sendKeys("student");
		
//		2. name
		WebElement pass_Textbox = driver.findElement(By.name("password"));
		pass_Textbox.clear();
		pass_Textbox.sendKeys("Password123");
		
//		id
		WebElement submit_Button = driver.findElement(By.id("submit"));
		submit_Button.click();
		
//		Verification
		String afterLoginTitle = driver.getTitle();
		if (actual_Title.equals(afterLoginTitle)) {
			System.out.println("Logged In Successfully");
		} else {
			System.out.println("Logged Not Successfully");
		}
		
		WebElement logoutButton = driver.findElement(By.linkText("Log out"));
		logoutButton.click();
		
		
//		Browser close
//		driver.quit();
		
		
//		https://demo.guru99.com/test/newtours/register.php
//		https://demo.guru99.com/test/delete_customer.php
//		https://www.globalsqa.com/demo-site/draganddrop/

	}

}
