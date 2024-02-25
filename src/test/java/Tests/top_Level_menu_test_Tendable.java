package Tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browserclass.BrowserwakeUP;
import POM.Main_Page;
import Utility.Utilclass;

 
public class top_Level_menu_test_Tendable extends BrowserwakeUP{


	public static String screenshotsubname;
	public Main_Page a;
 
	@Parameters("browser")
	@BeforeClass
	public void testLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			BrowserwakeUP.Chrome();
			driver.get("https://www.tendable.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}

	}
	
	
	@BeforeMethod
	public void verify_main_Page()
	{
		System.out.println("Test Started");	
	}
	
	@Test(priority = 1 ,description = "verifying home page titile and url")
	public void Home_menu_test() throws Throwable
	{
		  a=new Main_Page(driver);
 
		    String current_titile=driver.getTitle();
			
			System.out.println(current_titile);
			
			assertEquals(current_titile,"Quality Improvement App | Health and Social Care | Tendable");
			
			String current_url=driver.getCurrentUrl();
			
			assertEquals( current_url, "https://www.tendable.com/");
			
			System.out.println(current_url);
			
			 a.home_Page();
		  
	}
	
	@Test(priority = 2 ,description = "verifying our story from menus",groups = {"@sanity"})
	public void Home_Our_Story_test() throws Throwable
	{
		a.our_story();
		System.out.println("our story menu accessibility tested");
	}
	
	@Test(priority = 3,description = "verifying our solution from menus",groups = {"@sanity"})
	public void Home_Our_solution_test() throws Throwable
	{
		
		a.our_solution();
		System.out.println("our solution menu accessibility tested");
		
	}
	
	@Test(priority = 4,description = "verifying Why_Tendable from menus",groups = {"@sanity"})
	public void Home_Why_Tendable_test() throws Throwable
	{
		a.why_tendal();
		System.out.println("why tendal menu accessibility tested");
	}
	
	@Test(priority = 5,description = "verifying contact us" ,groups = {"@sanity","@smoke"})
	public void test_contact_us() throws Throwable
	{
		a.test_contact_us();
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {

			Utilclass utilclass = new Utilclass();
			utilclass.takescreenshot(
					result.getTestContext().getName() + "_" + result.getMethod().getMethodName() + ".png");

		} else {

			System.out.println("Test Done");

		}
	}

	
	
	
	
	
	 
	@AfterClass
	@Parameters("browser")
	public void setDown(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

 	 
 		  driver.quit();

			System.out.println("Automated Test for top_Level_menu_test_Tendable is done");
            System.out.println("Request demo button pressence and activity tested");
		}
	}

	
}
