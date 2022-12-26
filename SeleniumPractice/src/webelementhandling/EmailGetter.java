package webelementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmailGetter {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
Actions action=new Actions(driver);

driver.manage().deleteAllCookies();
driver.manage().window().maximize();

driver.get("https://www.convertcsv.com/email-extractor.htm");

Thread.sleep(2000);

driver.findElement(By.id("fileTabLink")).click();

action.moveToElement(driver.findElement(By.id("f1"))).perform();
Thread.sleep(2000);
action.moveToElement(driver.findElement(By.id("btnRun"))).perform();
Thread.sleep(2000);
System.out.println((driver.findElement(By.id("f1")).getAttribute("Class")));
Thread.sleep(2000);


driver.findElement(By.id("f1")).sendKeys("C:\\Users\\prath\\Downloads\\West Zone QA Jobs 22 Dec 2022.pdf");

Thread.sleep(2000);

	}

}
