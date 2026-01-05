package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	String str = "Java";  // Global 

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		// Normal xPath
		WebElement userName = driver.findElement(By.xpath("//input[@type ='text']"));
		userName.sendKeys("ABCD");
		
		// By using text()
//		//*[text()='Submit']
//		preceding-sibling
//		//*[text()='Submit']/../preceding-sibling::div[1]/span
		
		
		

	}

}
