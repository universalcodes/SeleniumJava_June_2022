package actionsSelenium;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelenium {
	
	static WebDriver driver;
	static	String get_url ="https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";
	static String right_clk_text = "//*[contains(text(), 'Try checking your spelling')]";
	static String right_clk_locator = "//*[@aria-label='Amazon']";
	static String double_clk_locator = "//*[text()='Up to 70% off | Clearance store']";
	static String click_right_action = "(//*[@aria-disabled='false'])[2]";
	static String click_left_action = "(//*[@aria-disabled='false'])[1]";
	static String click_left_action_computers = "//*[text()='Computers']";
	static String click_right_action_mobiles = "//*[text()='Mobiles']";
	static String hover_action = "(//span[@class='nav-a-content'])[8]";
	static String afterhover_click = "(//a[text()='Syska'])[2]";

	

	public static void getSelenium_Driver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome has been launched");	
	}
	
	public static void get_URLDetails() throws InterruptedException  
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(get_url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
	
}
	
	
	public static void hover_Elementss() throws InterruptedException
	{
		Actions hoveraction = new Actions(driver);
		WebElement hover_camera = driver.findElement(By.xpath(hover_action));
		hoveraction.moveToElement(hover_camera).build().perform();
		

	}
	
	public static void clickthroughActions() throws InterruptedException
	{
		
		Thread.sleep(3000);
		Actions after_hover_clickaction = new Actions(driver);
		WebElement after_hover_click_ele = driver.findElement(By.xpath(afterhover_click));
		after_hover_clickaction.moveToElement(after_hover_click_ele).click().build().perform();
	}
	
	public static void rightclick() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions rightclick_clickaction = new Actions(driver);
		WebElement right_click_ele = driver.findElement(By.xpath(right_clk_text));
		rightclick_clickaction.moveToElement(right_click_ele).contextClick().build().perform();
		System.out.println("Text Right click performed");
		
		driver.navigate().refresh();
		Thread.sleep(10000);
		right_click_ele = driver.findElement(By.xpath(right_clk_locator));
		rightclick_clickaction.moveToElement(right_click_ele).contextClick().build().perform();
		System.out.println("Logo Right click performed");
	
		
		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		right_click_ele = driver.findElement(By.xpath(right_clk_locator));
		rightclick_clickaction.moveToElement(right_click_ele).click().build().perform();
		System.out.println("Logo click performed");

	}
	
	public static void doubleclick_action() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions doubleclk_action = new Actions(driver);
		WebElement doiuble_click_ele = driver.findElement(By.xpath(double_clk_locator));
		doubleclk_action.moveToElement(doiuble_click_ele).doubleClick().build().perform();
		System.out.println("Text double  click performed");
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		getSelenium_Driver();
		get_URLDetails();
		hover_Elementss();
		clickthroughActions();
		rightclick();
		doubleclick_action();
	}

}
