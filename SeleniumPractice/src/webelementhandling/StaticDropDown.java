package webelementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\prath\\OneDrive\\Desktop\\Desktop\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement elements = driver.findElement(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));

		Select sl = new Select(elements);
		sl.selectByValue("IND");

		Thread.sleep(1000);

		driver.close();

	}
}