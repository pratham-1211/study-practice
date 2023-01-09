package webelementhandling;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailGetter extends RobotClass {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		RobotClass rb = new RobotClass();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, option);

		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// Applying Implicit Waits of 5sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:products.aspose.app/email/extractor");

//Way 1: uploading by sendKey() method.
		driver.findElement(By.id("UploadFileInput-1")).sendKeys("C:\\Users\\prath\\Downloads\\West.pdf");

//Way 2: Browsing the file using AutoIT.
//		action.moveToElement(driver.findElement(By.id("UploadFileInput-1"))).click().build().perform();
		Thread.sleep(1000);

		WebElement upBtn = driver.findElement(By.id("uploadButton"));
		Thread.sleep(2000);
		if (upBtn.isDisplayed()) {
			upBtn.click();
		} else {
			System.out.println("uploadButton Not Present");
		}

		WebElement dwnBtn = driver.findElement(By.id("DownloadButton"));
		Thread.sleep(10000);
		if (dwnBtn.isDisplayed() && dwnBtn.isEnabled()) {

			action.moveToElement(dwnBtn);

			action.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build()
					.perform();

		} else {
			System.out.println("DownloadButton Not Present");
		}
	}
}
