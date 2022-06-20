package locators_ss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium_browser_setup.URLACtions;

public class Sele_Locatorss {
	

	
	 static WebDriver webdriver;

	public static void get_locatorss_linktext(WebDriver driver) throws InterruptedException
	{
		
		
		String url = "https://www.amazon.in/";
		String linkText1 ="Computers";

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Selenium
		System.out.println("Chrome driver has been launched"); // Java
	
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText(linkText1)).click(); not recommanaded
		
		WebElement linktextclick=driver.findElement(By.linkText(linkText1)); 
		
		Thread.sleep(5000);
		linktextclick.click();
		
	
	}
	
	
	public static void get_locatorss_id(WebDriver driver) throws InterruptedException
	{
		
		
		String url = "https://www.amazon.in/";
		String address_id ="nav-global-location-slot";

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Selenium
		System.out.println("Chrome driver has been launched"); // Java
	
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		WebElement linktextclick=driver.findElement(By.id(address_id)); 
		
		Thread.sleep(5000);
		linktextclick.click();
	
	}
	
	public static void get_locatorss_name(WebDriver driver) throws InterruptedException
	{
		
		
		String url = "https://www.amazon.in/";
		String search_name_box ="field-keywords";

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Selenium
		System.out.println("Chrome driver has been launched"); // Java
	
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		WebElement linktextclick=driver.findElement(By.name(search_name_box)); 
		
		Thread.sleep(5000);
		linktextclick.click();
		linktextclick.sendKeys("OnePlus");
		
		linktextclick.sendKeys(Keys.ENTER);

	}
	
	
	
	
	public static void get_locatorss_partial_text(WebDriver driver) throws InterruptedException
	{
		
		
		String url = "https://www.amazon.in/";
		String partiallinkTextclick ="Today's";

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Selenium
		System.out.println("Chrome driver has been launched"); // Java
	
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		WebElement linktextclick=driver.findElement(By.partialLinkText(partiallinkTextclick)); 
		
		Thread.sleep(5000);
		linktextclick.click();
		

	}
	
	public static void get_locatorss_tagname(WebDriver driver) throws InterruptedException
	{
		
		
		String url = "https://www.amazon.in/";
		String tagnameclick ="h2";

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Selenium
		System.out.println("Chrome driver has been launched"); // Java
	
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		WebElement gettexth2=driver.findElement(By.tagName(tagnameclick)); 
		
		Thread.sleep(5000);
		System.out.println(gettexth2.getText());
		

	}
	
	
	public static void get_locatorss_className(WebDriver driver) throws InterruptedException
	{
		
		
		String url = "https://www.airbnb.co.in/";
		String getclasslocator ="c1yo0219 dir dir-ltr";

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Selenium
		System.out.println("Chrome driver has been launched"); // Java
	
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		WebElement logoclick=driver.findElement(By.className(getclasslocator)); 
		
		
		
		Thread.sleep(5000);
		
		logoclick.click();
		

	}
	
	
	public static void get_locatorss_linktext_xpath(WebDriver driver) throws InterruptedException
	{
		
		
		String url = "https://www.amazon.in/";
		String linkText1 ="Computers";

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Selenium
		System.out.println("Chrome driver has been launched"); // Java
	
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText(linkText1)).click(); not recommanaded
		
		WebElement linktextclick=driver.findElement(By.linkText(linkText1)); 
		
		Thread.sleep(5000);
		linktextclick.click();
		
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		

		//Sele_Locatorss.get_locatorss_linktext(webdriver);
		
		//Sele_Locatorss.get_locatorss_id(webdriver);
		
		//Sele_Locatorss.get_locatorss_name(webdriver);
		
		//Sele_Locatorss.get_locatorss_partial_text(webdriver);
		
	//	Sele_Locatorss.get_locatorss_tagname(webdriver);
		
		Sele_Locatorss.get_locatorss_className(webdriver);


	}
	

}
