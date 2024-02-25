package Browserclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserwakeUP {

	public static WebDriver driver;
	
	public static WebDriver Chrome()
	{
		
    System.setProperty("webdriver.chrome.driver", "E:\\SOFTWEAR\\eclipse\\eclipse-java-2023-06-R-win32-x86_64\\eclipse\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
	 
		 driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 
		 return driver;
  
	}
	
	
}
