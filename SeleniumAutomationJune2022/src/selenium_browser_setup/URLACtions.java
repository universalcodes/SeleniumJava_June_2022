package selenium_browser_setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLACtions {
	
	
	 static WebDriver webdriver;

	 public static void getchrome(WebDriver webdriver) {
		 WebDriverManager.chromedriver().setup(); // set up chrome driver
			webdriver = new ChromeDriver(); // Selenium
			System.out.println("Chrome driver has been launched"); // Java
	 }
	 
	 
	 
	public static void browserset(WebDriver webdriver) throws InterruptedException {
		try {
		
			
			/*
			 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
			 * System.out.println("Edge driver has been launched"); // Java
			 */		
			Thread.sleep(10000);  // wait 
			
			// Deleting cookies
			webdriver.manage().deleteAllCookies();
			
			System.out.println("Cookies Deleted"); // Java

			Thread.sleep(5000);  // wait 


			// maximizing the windows	
			webdriver.manage().window().maximize();
			Thread.sleep(5000);  // wait 

			
			System.out.println("Browser Maximize"); // Java
			
			
			// maximizing the windows	
			webdriver.manage().window().fullscreen();
					
					System.out.println("Browser Full Screen"); // Java
					
					webdriver.get("https://www.amazon.in/");
					
					System.out.println("Browser Launched");
					
					
					System.out.println("The Current URL is" + "\t" +webdriver.getCurrentUrl());
					System.out.println("The Current Title is" + "\t" +webdriver.getTitle());
					
					

					System.out.println("Automation is Passed");
					
					webdriver.navigate().refresh();
					
					System.out.println("Browser is Refreshed");
					
					
					
					
					/*
					 * //<**-----BrowserBack-------**> webdriver.navigate().back();
					 * webdriver.navigate().forward();
					 */

					
					Thread.sleep(5000);  // wait 


			}
			
			catch (RuntimeException e) {
				System.out.println("Browser is closed before refresh");
			}
						
	}

	public static void main(String[] args) throws InterruptedException {
	
		
		
			
		}
	
		
	}

