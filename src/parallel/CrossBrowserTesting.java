package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	@Test
	public void fireFox() { 
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		WebElement userName_Textbox = driver.findElement(By.id("username"));
		userName_Textbox.clear();
		userName_Textbox.sendKeys("student");

		WebElement pass_Textbox = driver.findElement(By.name("password"));
		pass_Textbox.clear();
		pass_Textbox.sendKeys("Password123");

		WebElement submit_Button = driver.findElement(By.id("submit"));
		submit_Button.click();
		
		System.out.println("Method - 1: " + Thread.currentThread().getId());
	}

	@Test
	public void chrome() { 
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		WebElement userName_Textbox = driver.findElement(By.id("username"));
		userName_Textbox.clear();
		userName_Textbox.sendKeys("student");

		WebElement pass_Textbox = driver.findElement(By.name("password"));
		pass_Textbox.clear();
		pass_Textbox.sendKeys("Password123");

		WebElement submit_Button = driver.findElement(By.id("submit"));
		submit_Button.click();
		
		System.out.println("Method - 2: " + Thread.currentThread().getId());
	}
	
	@Test
	public void chromedemo() { 
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		WebElement userName_Textbox = driver.findElement(By.id("username"));
		userName_Textbox.clear();
		userName_Textbox.sendKeys("student");

		WebElement pass_Textbox = driver.findElement(By.name("password"));
		pass_Textbox.clear();
		pass_Textbox.sendKeys("Password123");

		WebElement submit_Button = driver.findElement(By.id("submit"));
		submit_Button.click();
		
		System.out.println("Method - 3: " + Thread.currentThread().getId());
	}

}
