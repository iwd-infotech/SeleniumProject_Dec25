package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		// Global Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Disadvantages: 
//		1. Applies to everywhere
//		2. Slow test Execution
//		3. Not recommended for framework
		
		WebElement userName_Textbox = driver.findElement(By.id("username"));
		userName_Textbox.clear();
		userName_Textbox.sendKeys("student");
		
//		2. Explicit Wait
//		Applied to specific element 
//		Explicit Wait tells to the web driver wait until condition is true
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement pass_Textbox = wait.until(ExpectedConditions.visibilityOf((WebElement) By.name("password")));
		pass_Textbox.clear();
		pass_Textbox.sendKeys("Password123");
		
		WebElement submit_Button = driver.findElement(By.id("submit"));
//		wait.until(ExpectedConditions.numberOfWindowsToBe(0)
		submit_Button.click();

	}

}
