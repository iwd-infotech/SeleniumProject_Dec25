package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement selectCountry = driver.findElement(By.name("country"));
		
		// Select is a class in Selenium - there are 3 methods in Select class
		Select select = new Select(selectCountry);
//		select.selectByIndex(12);
//		select.selectByValue("BRAZIL");
		select.selectByVisibleText("INDIA");

	}

}
