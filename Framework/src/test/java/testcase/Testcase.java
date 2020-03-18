package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Login;

public class Testcase extends Baseclass{

	
	@Test
	public void login() throws Exception {
		
		logger=report.createTest("Prince Application Testing");
		
		Login l=PageFactory.initElements(driver, Login.class);
		
		logger.info("Starting application");
		
		l.loginIntoApplication(username, password);
		
		logger.pass("success");

	}

}
