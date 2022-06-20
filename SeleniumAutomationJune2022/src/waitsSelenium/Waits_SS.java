package waitsSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits_SS {
	
	static String uRL1 ="https://futurefocusededucation.org/x3-internship/";

	
	public static void implicit_wait_automation()
	{
			
			WebDriverManager.chromedriver().setup();	
			WebDriver	driver = new ChromeDriver();
			driver.get(uRL1);
		
		try 
		{
			//Thread.sleep(0);
			//driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		catch (TimeoutException e) 
		{
			System.out.println("Timeout Exception has been catched");
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());	
}


public static void pageload_wait_automation()
{
		
		WebDriverManager.chromedriver().setup();	
		WebDriver	driver = new ChromeDriver();
		driver.get(uRL1);
	
	try 
	{
		//Thread.sleep(0);
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	}
	
	catch (TimeoutException e) 
	{
		System.out.println("Timeout Exception has been catched");
	}
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());	
}

public static void explicit_wait_automation()
{
		
		WebDriverManager.chromedriver().setup();	
		WebDriver	driver = new ChromeDriver();
		driver.get(uRL1);
	
	try 
	{
		//Thread.sleep(0);
		
		WebDriverWait wait= new WebDriverWait(driver, 23);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(uRL1)));
				
	}
	
	catch (TimeoutException e) 
	{
		System.out.println("Timeout Exception has been catched");
	}
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());	
}
}

