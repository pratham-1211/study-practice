package webelementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAutPopup {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
Thread.sleep(2000);
driver.get("https://admin:admin@the-internet.herokuapp.com/");
driver.findElement(By.linkText("Basic Auth")).click();
Thread.sleep(2000);
driver.close();
	}

}
