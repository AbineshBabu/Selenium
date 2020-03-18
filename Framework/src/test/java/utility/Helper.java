package utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Helper {
		
	public static String captureScreen(WebDriver driver,String methodname) throws Exception {
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 String filepath="./screenshot/"+methodname+".png";
		 Files.copy(screenshotFile, new File(filepath));
		 return filepath;
	}


}
