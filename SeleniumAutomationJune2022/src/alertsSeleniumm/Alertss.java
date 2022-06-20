package alertsSeleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium_browser_setup.SeleniumBrowser;

public class Alertss  extends SeleniumBrowser{
	
	static WebDriver driver;
	static	String get_url ="https://demo.seleniumeasy.com/";
	static String close_popup_xpath= "//a[@id='at-cv-lightbox-close']";
	static	String alert_clk ="//a[text()='Alerts & Modals']";
	static	String javascript_alert_link_click =  "Javascript Alerts";
	static	String clickme_btn =  "(//button[text()='Click me!'])[1]";
	static	String clickme_btn2 =  "(//button[text()='Click me!'])[2]";
	static String alert_message = "confirm-demo";
	static	String prompt_box =  "//button[text()='Click for Prompt Box']";
	static	String prompt_box_text =  "This is Alert Box";
	static String promptbox_message = "prompt-demo";


	
	public static void alertclick(WebDriver driver) throws InterruptedException 
	{
		
		WebElement input_link_click= driver.findElement(By.xpath(alert_clk));
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		input_link_click.click();
		System.out.println("Input Link Clicked");
		try 
		{
			driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			WebElement	alert_link_click=driver.findElement(By.linkText(javascript_alert_link_click));
			alert_link_click.click();
			System.out.println("Java Script Alert is Clicked");
			alert_link_click = driver.findElement(By.xpath(clickme_btn));
			alert_link_click.click();
			System.out.println(" Button is Clicked to get Alert");
			
			driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);

		///	driver.switchTo().alert().accept();  Technique 1 through alert Method
			
			driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);

			System.out.println("ok Button is Clicked");
			
			Alert click_alert = driver.switchTo().alert();
			
			click_alert.accept();
		}
	
		catch (TimeoutException exception) 
		{
			System.out.println("Element is not Interactable Properly");
		}
	}

	
	public static void alertclick_2() throws InterruptedException 
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(get_url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement close_popup= driver.findElement(By.xpath(close_popup_xpath));
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		close_popup.click();
		System.out.println("Pop has been closed");
		WebElement input_link_click= driver.findElement(By.xpath(alert_clk));
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		input_link_click.click();
		System.out.println("Input Link Clicked");
		try 
		{
			driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			WebElement	alert_link_click=driver.findElement(By.linkText(javascript_alert_link_click));
			alert_link_click.click();
			System.out.println("Java Script Alert is Clicked");
			alert_link_click = driver.findElement(By.xpath(clickme_btn2));
			alert_link_click.click();
			System.out.println(" Button is Clicked to get Alert");
			
			driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);

		///	driver.switchTo().alert().accept();  Technique 1 through alert Method
			
			driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);

			
			Alert click_alert = driver.switchTo().alert();
			System.out.println(click_alert.getText());

			click_alert.dismiss();
			
			alert_link_click = driver.findElement(By.id(alert_message));
			System.out.println(alert_link_click.getText());

			
			
			
		}
	
		catch (TimeoutException exception) 
		{
			System.out.println("Element is not Interactable Properly");
		}
	}
	
	public static void text_alertclick_2(WebDriver driver) throws InterruptedException 
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(get_url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement close_popup= driver.findElement(By.xpath(close_popup_xpath));
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		close_popup.click();
		System.out.println("Pop has been closed");
		WebElement input_link_click= driver.findElement(By.xpath(alert_clk));
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		input_link_click.click();
		System.out.println("Input Link Clicked");
		try 
		{
			driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			WebElement	alert_link_click=driver.findElement(By.linkText(javascript_alert_link_click));
			alert_link_click.click();
			System.out.println("Java Script Alert is Clicked");
			alert_link_click = driver.findElement(By.xpath(prompt_box));
			alert_link_click.click();
			System.out.println(" prompt_box is Clicked to get Alert");
			
			driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);

		///	driver.switchTo().alert().accept();  Technique 1 through alert Method
			
			driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);		

			Alert click_alert = driver.switchTo().alert();
			click_alert.sendKeys(prompt_box_text);
			System.out.println(click_alert.getText());
			click_alert.accept();
			alert_link_click = driver.findElement(By.id(promptbox_message));
			System.out.println(alert_link_click.getText());

		}
	
		catch (TimeoutException exception) 
		{
			System.out.println("Element is not Interactable Properly");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		getSelenium_Driver(driver);
	//	alertclick();
	//	alertclick_2();
	text_alertclick_2( driver);
		
		
	}
	
}
