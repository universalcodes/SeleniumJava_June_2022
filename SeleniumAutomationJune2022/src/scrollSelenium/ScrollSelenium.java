package scrollSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollSelenium {
	static WebDriver driver;
	static	String get_url ="https://www.amazon.in/";
	
	public static void getSelenium_Driver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome has been launched");
		
	}
	
	public static void getscroll() throws InterruptedException, IOException  
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(get_url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		JavascriptExecutor scrolling = (JavascriptExecutor) driver;
		System.out.println("Scroll full is going to perform");
		Thread.sleep(5000);
		
		
		
		
		System.out.println("Vertical Scroll");		
		Thread.sleep(5000);

		scrolling.executeScript("window.scrollBy(0, 1800)");
		Thread.sleep(5000);

		scrolling.executeScript("window.scrollBy(0, -1800)");
		Thread.sleep(5000);
		
		/*
		 * System.out.println("Horzitental Scroll"); Thread.sleep(5000);
		 * 
		 * scrolling.executeScript("window.scrollBy(1800, 0)"); Thread.sleep(5000);
		 * 
		 * scrolling.executeScript("window.scrollBy(-1800, 0)"); Thread.sleep(5000);
		 */
	

		
		WebElement scroll_see_more = driver.findElement(By.xpath("//*[text()='View all']"));
		
		scrolling.executeScript("arguments[0].scrollIntoView(true);",scroll_see_more);
		
		Thread.sleep(3000);
		
		System.out.println(scroll_see_more.getText());
		Thread.sleep(3000);
		
		//scroll_see_more.click();
		
		String ss_save = "C:\\Users\\yoges\\eclipse-workspace\\Automation\\screenshots\\Test.jpg\\";
		
		File sscreator = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sscreator, new File(ss_save));

		
		
		/*
		 * System.out.println("Horizontal Actions"); Thread.sleep(5000);
		 * scrolling.executeScript("window.scrollBy(1000, 0)"); Thread.sleep(5000);
		 * scrolling.executeScript("window.scrollBy(-1000, 0)"); System.out.println();
		 */

		
		/*
		 * WebElement scrollon_element =
		 * driver.findElement(By.xpath("(//*[contains(text(), 'See more')])[2]"));
		 * scrolling.executeScript("arguments[0].scrollIntoView(true);",scrollon_element
		 * ); Thread.sleep(5000); //scrollon_element.click();
		 * System.out.println(scrollon_element.getText());
		 * 
		 * Thread.sleep(5000);
		 */
		
		

	}

	
	public static void main(String[] args) throws InterruptedException, IOException {
		getSelenium_Driver();
		getscroll();
	}
}
