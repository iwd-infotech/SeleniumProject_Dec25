package window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

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
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				
				System.out.println("Child Window Title: " +driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Back to Parent Window:" +driver.getTitle());
		
	}

}
