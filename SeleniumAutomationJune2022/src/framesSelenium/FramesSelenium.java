package framesSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesSelenium   {
	
	
	static WebDriver driver;
	static	String get_url ="https://qavalidation.com/demoiframe/";
	static	String frame_1 =  "input1";
	static	String frame_url =  "//a[text()='SignUp Form']";
	
	
	public static void getSelenium_Driver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome has been launched");
		
	}
	
	
	public static void getframes()  
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(get_url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		/*
		 * WebElement link1 = driver.findElement(By.xpath("//iframe[@id='Frame1']"));
		 * driver.switchTo().frame(link1);
		 */
		
		driver.switchTo().frame(0);

		WebElement link = driver.findElement(By.partialLinkText("SignUp"));
		link.click();
		driver.switchTo().parentFrame();
		System.out.println("it will out of child frame1");

		WebElement link1 = driver.findElement(By.linkText("Home"));
		driver.switchTo().frame(1);

				link1.click();
		
		
		driver.switchTo().parentFrame();

		System.out.println("it will out of child frame");
		
	link	= driver.findElement(By.linkText("//*[text()='About me']"));
	link.click();
	}

	
	public static void main(String[] args) {
			
			getSelenium_Driver();
			
			getframes();
			
		
	}
	

}
