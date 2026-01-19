package window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Current Window id - unique ID
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window ID: " +parentWindow);
		
		WebElement clickHere_Link =  driver.findElement(By.linkText("Click Here"));
		clickHere_Link.click();
		
		// all open windows child + parent
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String window : allWindows) {
			driver.switchTo().window(window);
			String childWindow1 = driver.getTitle();
			System.out.println("1st Child Title: " +childWindow1);
			
			if(childWindow1.contains("Windows New")) {
				System.out.println("Child Window First handled");
				driver.close();
			}
			
			else if (childWindow1.contains("Second Window")) {
				System.out.println("Child Window Second handled");
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Back to Parent Window:" +driver.getTitle());
		
	}

}
