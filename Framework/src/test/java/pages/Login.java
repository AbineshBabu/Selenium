package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	WebDriver driver;
	
	@FindBy(id = "j_usename") WebElement user;
	@FindBy(id = "j_password") WebElement password;
	@FindBy(xpath = "//button[text()='Sign in']") WebElement click;
	
	public Login(WebDriver ldriver) {
		this.driver=ldriver;
	}

	public  void loginIntoApplication(String username,String pswd) throws Exception {
		
		Thread.sleep(3000);
		user.sendKeys(username);
		Thread.sleep(3000);
		password.sendKeys(pswd);
		Thread.sleep(3000);
		click.click();	}
}
