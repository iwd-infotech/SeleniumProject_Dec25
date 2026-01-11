package param;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderConcept {

	@Test(dataProvider = "dataProvider")
	public void login(String username, String pass) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement userName_Textbox = driver.findElement(By.id("username"));
		userName_Textbox.clear();
		userName_Textbox.sendKeys(username);
		
		WebElement pass_Textbox = driver.findElement(By.name("password"));
		pass_Textbox.clear();
		pass_Textbox.sendKeys(pass);
		
		WebElement submit_Button = driver.findElement(By.id("submit"));
		submit_Button.click();
	}

	@DataProvider
	public Object[][] dataProvider() {
		Object[][] data = new Object[3][2];

		data[0][0] = "student";
		data[0][1] = "Password123";

		data[1][0] = "student";
		data[1][1] = "1232345";
		
		data[2][0] = "dsdjhfg";
		data[2][1] = "Password123";

		return data;}
}
