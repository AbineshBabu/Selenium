package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.Browserfactory;
import utility.Helper;
import utility.Readproperty;

public class Baseclass extends StoreData{

	public WebDriver driver;
	public Readproperty property;
	public StoreData excelValue;
	public ExtentReports report;
	public ExtentTest logger; 
	
	@BeforeSuite
	public void InitialiseSuite() throws Exception {
		excelValue=new StoreData();
		property=new Readproperty();
		excelValue.Store();
		
		ExtentHtmlReporter html=new ExtentHtmlReporter("./Report/Report.html");
		report=new ExtentReports();
		report.attachReporter(html);
		
	}
	
	@BeforeClass
	public void start() throws Exception {		
		WebDriver s=Browserfactory.startApplication(driver, property.getBrowser(),property.getURL());
		driver=s; 
	}
	
	@AfterClass
	public void tearDown() {
		Browserfactory.quitApplication(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws Exception {
		if(result.getStatus()==ITestResult.FAILURE) {
			String filepath=Helper.captureScreen(driver,result.getName());
			logger.fail("jail", MediaEntityBuilder.createScreenCaptureFromPath(filepath).build());
		}
		
		report.flush();
	}
	


}
