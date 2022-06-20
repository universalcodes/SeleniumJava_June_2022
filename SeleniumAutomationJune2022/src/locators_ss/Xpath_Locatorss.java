package locators_ss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locatorss {
	
	static WebDriver driver;

	public static void get_Xpath_ByName(WebDriver driver) throws InterruptedException
	{
		
		
		String url = "https://www.amazon.in/";
/*		String search_name_box ="//*[@name='field-keywords']";    
*/		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Selenium
		System.out.println("Chrome driver has been launched"); // Java
	
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);  
		
		WebElement linktextclick=driver.findElement(By.xpath("//*[@name='field-keywords']")); 
		
		Thread.sleep(5000);
		linktextclick.click();
		linktextclick.sendKeys("OnePlus");
		
		linktextclick.sendKeys(Keys.ENTER);

	}
	public static void main(String[] args) throws InterruptedException {
		get_Xpath_ByName(driver);
	}
}
