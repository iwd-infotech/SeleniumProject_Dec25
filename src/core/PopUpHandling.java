package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement CusID = driver.findElement(By.name("cusid"));
		CusID.clear();
		CusID.sendKeys("San76");
		Thread.sleep(3000);
		WebElement submitButton = driver.findElement(By.xpath("//*[@name='submit']"));
		submitButton.click();
		Thread.sleep(3000);
//		Alert - Alert is a Interface in selenium
		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
		String popUpmsg = alert.getText();
		System.out.println(popUpmsg);
		

	}

}
