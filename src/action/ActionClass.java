package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {

	@Test
	public void dragDrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//*[text()='High Tatras']"));
		WebElement destination = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(source).moveToElement(destination).release().perform();//
//		action.dragAndDrop(source, destination).perform();
		action.doubleClick(destination);
		action.contextClick(source);
		
		action.click(source)
			  .keyDown(Keys.CONTROL)
			  .sendKeys("c")
			  .keyUp(Keys.CONTROL)
			  .perform();
		
		action.sendKeys(Keys.ENTER).perform();
		
	}

}
