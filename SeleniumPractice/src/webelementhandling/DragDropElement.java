package webelementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDropElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		Thread.sleep(2000);
		
		
		WebElement srcEl=driver.findElement(By.id("draga"));
		WebElement desEl=driver.findElement(By.id("dragb"));
		
		
		action.scrollToElement(srcEl);		
		Thread.sleep(2000);
		
		action.moveToElement(srcEl);
		
		action.clickAndHold(srcEl)
			.moveToElement(desEl)
				.release()
				.build().perform();
		
//		action.dragAndDrop(srcEl, desEl);

//		Thread.sleep(5000);
//		driver.close();

	}
}