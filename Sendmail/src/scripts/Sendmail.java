package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import pages.Gmailpage;

public class Sendmail {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/");
	}

	@Test(priority = 0)
	public void Send_mail_successful() {
		
	 Gmailpage user = new Gmailpage(driver);
			
		 user.typetxtYourmail();
		 user.clickbtnNext();
		 user.typetxtPass();
		 user.clickbtnSignin();
		 user.clickbtnCreate();
		 user.typetxtSendtomail();
		 user.typetxtSubject();
		 user.typetxtDescription();
		 user.clickbtnSubmit();
		 
	}

}
