package event;

import org.openqa.selenium.WebDriver;

import detail.Sendmaildetail;
import pages.Gmailpage;

public class Sendmailevent {
	WebDriver driver;

	public Sendmailevent(WebDriver driver) {
		this.driver = driver;
	}

	public void Send_mail_successful(Sendmaildetail Sendmaildetail) {
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
