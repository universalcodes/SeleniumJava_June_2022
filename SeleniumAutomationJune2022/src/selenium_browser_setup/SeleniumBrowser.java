package selenium_browser_setup;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBrowser {
static	String get_url = "https://demo.seleniumeasy.com/";
static String close_popup_xpath= "//a[@id='at-cv-lightbox-close']";

	

	public static void getSelenium_Driver(WebDriver driver)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome has been launched");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(get_url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement close_popup= driver.findElement(By.xpath(close_popup_xpath));
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		close_popup.click();
		System.out.println("Pop has been closed");
	}
	

	public static void main(String[] args) throws InterruptedException {

		
	}
}
