package param;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	@Test(dataProvider = "dataProvider")
	public void login(Integer n, String s) {
		
		System.out.println("Number: " +n);
		System.out.println("String: " +s);
		
	}

	@DataProvider
	public Object[][] dataProvider() {
		Object[][] data = new Object[2][2];

		data[0][0] = 10;
		data[0][1] = "Java";

		data[1][0] = 20;
		data[1][1] = "Selenium";

		return data;}
}
