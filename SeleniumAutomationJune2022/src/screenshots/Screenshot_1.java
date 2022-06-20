package screenshots;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot_1 {
	
	static WebDriver driver;
	static	String get_url ="https://www.amazon.in/";
	static String addstr= " Home Page";
	static String addstr1= " Home Page1";
	static LocalDateTime currenttime =  LocalDateTime.now();
	static  String savetime=	currenttime.toString().replace('-', ' ').replace(':', ' ');
	static  String savetime1=	currenttime.toString().replace('-', ' ').concat(addstr1).replace(':', ' ');
	static 	String gas_xpath = "//img[@alt= 'Surya Flame Black Beauty 3 Burner Glass Top Gas Stove Manual Ignition with 2 Years Door Step Warranty']";

	
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
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(5000);
		
	}
		
		public static void screenshot_take_driver() throws IOException 
		{
				
			 LocalDateTime currenttime =  LocalDateTime.now();
			  String savetime=	currenttime.toString().replace('-', ' ').replace(':', ' ');
		  		String screenshot_save_path = "C:\\Users\\yoges\\eclipse-workspace\\Automation\\screenshots\\" +	savetime	+"  (TestCaseScreenshot).png";
			    File createscreenshot = ((TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(createscreenshot, new File(screenshot_save_path));
			    System.out.println("Screenshot Taken");
		}   
			
		public static void screenshot_take_element() throws IOException 
		{
				String screenshot_save_path1 = "C:\\Users\\yoges\\eclipse-workspace\\Automation\\screenshots\\" +	savetime1	+"  (TestCaseScreenshot_element).png";
			  WebElement gasStove_Picture_Taken = driver.findElement(By.xpath(gas_xpath));
			  File  createscreenshot = ((TakesScreenshot) gasStove_Picture_Taken ).getScreenshotAs(OutputType.FILE);
				    FileUtils.copyFile(createscreenshot, new File(screenshot_save_path1));
				    System.out.println("Gas Screenshot Taken");    
		}
	
		
		public static void fullSS_Ashot() throws IOException
		{
			String addstr= " Full Ashot";
			LocalDateTime currenttime =  LocalDateTime.now();
			System.out.println(currenttime);
			String savetime=	currenttime.toString().replace('-', ' ').concat(addstr).replace(':', ' ');
			System.out.println("Converted time is" + "\t" + savetime);
		
			System.out.println("Scroll taken thorugh A shot");
			String screenshot_save_path = "C:\\Users\\yoges\\eclipse-workspace\\Automation\\screenshots\\" +	savetime	+"  (TestCaseScreenshot_Full).jpg";
			Screenshot scroll1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(3)).takeScreenshot(driver);
			ImageIO.write(scroll1.getImage(), "jpg", new File(screenshot_save_path));
		
		}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		getSelenium_Driver();
		
		get_URLDetails();
		
		screenshot_take_driver();
		
		//fullSS_Ashot();
		
		
		
	}

}
