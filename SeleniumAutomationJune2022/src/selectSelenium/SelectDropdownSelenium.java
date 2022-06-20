package selectSelenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownSelenium {
	
	static WebDriver driver;
	static String close_popup_xpath= "//a[@id='at-cv-lightbox-close']";
	static	String get_url ="https://demo.seleniumeasy.com/";
	static	String input_clk ="//a[text()='Input Forms']";
	static	String drpdwn_link_click =  "Select Dropdown List";
	static	String drpdwn_list =  "//select[contains(@id, 'select-demo')]";
	static	String selected_drp_list =  "//p[contains(@class, 'selected-value')]";
	static	String multi_drplist =  "//select[@multiple='multiple']";

	
	
	


	public static void getSelenium_Driver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome has been launched");
		
	}
	
	public static void getdropdownURLs()  
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(get_url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement close_popup= driver.findElement(By.xpath(close_popup_xpath));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		close_popup.click();
		System.out.println("Pop has been closed");
		WebElement input_link_click= driver.findElement(By.xpath(input_clk));
		input_link_click.click();
		System.out.println("Input Link Clicked");
		try 
		{
			
			WebElement	input_link_click1=driver.findElement(By.linkText(drpdwn_link_click));
			input_link_click1.click();
		}
		catch (TimeoutException exception) 
		{
			System.out.println("Element is not Interactable Properly");
		}
		System.out.println("Dropdown URL Clicked");
	}
	
	public static void getdropdownlistselect() throws InterruptedException  
	{
		WebElement droplist = driver.findElement(By.xpath(drpdwn_list));
		System.out.println(droplist.getText());
		System.out.println(droplist.getAttribute(drpdwn_list));
		Select selt_drplist = new Select(droplist);
		selt_drplist.selectByVisibleText("Saturday");
		Thread.sleep(5000);
		droplist = driver.findElement(By.xpath(selected_drp_list));
		System.out.println(droplist.getText());
		Thread.sleep(5000);
		selt_drplist.selectByIndex(5);
		System.out.println("Index selected" + "\t"+ droplist.getText());
		Thread.sleep(5000);
		selt_drplist.selectByValue("Sunday");
		System.out.println("Value selected" + "\t"+ droplist.getText());
		System.out.println("Select Operations are completed");	
	}
	
	
	public static void getmultidropdownlistselect() throws InterruptedException  
	{
		WebElement droplist = driver.findElement(By.xpath(multi_drplist));
	//	System.out.println("Multidropdown list as follows" + "\n"+droplist.getText());
		
		Select get_drplist = new Select(droplist);
		java.util.List<WebElement> multi_drp_elemt = get_drplist.getOptions();
		System.out.println(multi_drp_elemt.size());
		
		for (WebElement getalloptionstext : multi_drp_elemt)
		{
			System.out.println(getalloptionstext.getText());
			
		}
		
		get_drplist.selectByIndex(0);
		System.out.println("Index selected");
		get_drplist.selectByValue("New York");
		System.out.println("Value selected");
		get_drplist.selectByVisibleText("Texas");
		System.out.println("Text selected");

		get_drplist.deselectByIndex(0);
		System.out.println("Index Deelected");
		get_drplist.deselectByValue("New York");
		System.out.println("Value selected");
		get_drplist.deselectByVisibleText("Texas");
		System.out.println("Text selected");
		

		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		getSelenium_Driver();
		getdropdownURLs();
		
		getdropdownlistselect();
		//getmultidropdownlistselect();
		
	}

}
