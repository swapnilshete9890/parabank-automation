package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	public static String takeScreenshot(WebDriver driver, String fileName)
	{
		 String path = System.getProperty("user.dir") 
                 + "/screenshots/" + fileName + ".png";
		try
		{
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return path;
	}

}
