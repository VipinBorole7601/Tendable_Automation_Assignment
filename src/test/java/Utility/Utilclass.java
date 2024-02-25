package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Browserclass.BrowserwakeUP;

public class Utilclass extends BrowserwakeUP{

	/**
	 *  Waits,Actions,Capturing Screenshots, accessing excels, Sending emails 
	 * 
	 */
	
	  
	  
	
	public void takescreenshot(String result) throws IOException  
	{
		Date currentdate = new Date();
	
		 String filename = currentdate.toString().replace(" "," - ").replace(":", "_");
		 
		 File screenshotimage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 org.apache.commons.io.FileUtils.copyFile(screenshotimage, new File(".//screenshots/"+filename+".png"));
		 
		 
	}
	
	
}
