package inputFormDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input_Formss {
	
	static WebDriver driver;
	
	static String close_popup_xpath= "//a[@id='at-cv-lightbox-close']";
		
	static	String get_url ="https://demo.seleniumeasy.com/";
	static	String input_clk ="//a[text()='Input Forms']";
	static	String simple_link_click =  "Simple Form Demo";
	static	String placeholder_click ="//*[@placeholder='Please enter your Message']";
	static	String input_name ="Yogesh";
	static	String button_clk ="//button[text()='Show Medddssage']";
	static	String get_input_name_value ="//*[text()='Your Message: ']";
	static	String get_input_name_value1 ="display";


	public static void getSelenium_Driver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome has been launched");
		
	}
	
	public static void getInputFormDetails() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(get_url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement close_popup= driver.findElement(By.xpath(close_popup_xpath));
		Thread.sleep(5000);
		close_popup.click();
		System.out.println("Pop has been closed");
		WebElement input_link_click= driver.findElement(By.xpath(input_clk));
		input_link_click.click();
		System.out.println("Input Link Clicked");
		try 
		{
			
			WebElement	input_link_click1=driver.findElement(By.linkText(simple_link_click));
			input_link_click1.click();
		}
		catch (TimeoutException exception) 
		{
			System.out.println("Element is not Interactable Properly");
		}
		System.out.println("Simple Form Clicked");
	}

	public static void putInputFormDetails() throws InterruptedException
	{
		WebElement placeholder_input_value= driver.findElement(By.xpath(placeholder_click));
		Thread.sleep(5000);
		placeholder_input_value.sendKeys(input_name);

		WebDriverWait wait  =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(button_clk)));
		WebElement button_click= driver.findElement(By.xpath(button_clk));
		System.out.println("Explicit wait has been worked above");
		button_click.click();
		System.out.println("Button is clicked successfully");
		WebElement getname_value= driver.findElement(By.xpath(get_input_name_value));
		WebElement getname_value1= driver.findElement(By.id(get_input_name_value1));

		System.out.println(getname_value.getText() + "\t" + getname_value1.getText());
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		getSelenium_Driver();
		getInputFormDetails();
		
		putInputFormDetails();
		
	}

}
