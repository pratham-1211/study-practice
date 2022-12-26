package webelementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EmailGetter {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, option);
		
		WebDriver driver = new ChromeDriver(option);
		
		Actions action=new Actions(driver);

driver.manage().deleteAllCookies();
driver.manage().window().maximize();

driver.get("https://www.convertcsv.com/email-extractor.htm");
Thread.sleep(3000);
driver.findElement(By.id("fileTabLink")).click();

action.moveToElement(driver.findElement(By.id("f1"))).perform();
action.moveToElement(driver.findElement(By.id("btnRun"))).perform();
System.out.println((driver.findElement(By.id("f1")).getAttribute("Class")));


driver.findElement(By.id("f1")).sendKeys("C:\\Users\\prath\\Downloads\\West Zone QA Jobs 22 Dec 2022.pdf");

//driver.get("https://www.ilovepdf.com/pdf_to_word");
//action.moveToElement(driver.findElement(By.id("pickfiles"))).click().build().perform();
//action.moveToElement(driver.findElement(By.id("pickfiles"))).perform();

Thread.sleep(3000);
driver.close();




	}

}
