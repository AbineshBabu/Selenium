package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("hai");
	}

}
