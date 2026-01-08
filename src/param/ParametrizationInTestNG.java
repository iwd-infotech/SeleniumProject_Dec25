package param;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationInTestNG {
	
	WebDriver driver;
//	String browser = "firefox";
	
	@Parameters("browser")
	@Test
	public void param(String para) {
		
		if (para.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (para.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

}
