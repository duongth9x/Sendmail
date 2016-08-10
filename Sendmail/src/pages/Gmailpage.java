package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmailpage {
	WebDriver driver;
	
	@FindBy(id = "Email")
	private WebElement txtYourmail;
	
	@FindBy(id = "next")
	private WebElement btnNext;
	
	@FindBy(id = "Passwd")
	private WebElement txtPass;
	
	@FindBy(id = "signIn")
	private WebElement btnSignin;
	
	@FindBy(css = ".T-I.J-J5-Ji.T-I-KE.L3")
	private WebElement btnCreate;
	
	@FindBy(name = "to")
	private WebElement txtSendtomail;
	
	@FindBy(name = "subjectbox")
	private WebElement txtSubject;

	@FindBy(css = ".Am.Al.editable.LW-avf")
	private WebElement txtDescription;
	
	@FindBy(id = ":oi")
	private WebElement btnSubmit;

	public Gmailpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	public void typetxtYourmail() {
		txtYourmail.sendKeys("duongth9x@gmail.com");
	}
	
	public void clickbtnNext() {
		btnNext.click();
	}
	
	public void typetxtPass() {
		txtPass.sendKeys("13021992@");
	}
	
	public void clickbtnSignin() {
		btnSignin.click();
	}
	
	public void clickbtnCreate() {
		btnCreate.click();
	}
	
	public void typetxtSendtomail() {
		txtSendtomail.sendKeys("thuyduongtest02@gmail.com");
	}
	
	public void typetxtSubject() {
		txtSubject.sendKeys("Duongxinh");
	}
	
	public void typetxtDescription() {
		txtDescription.sendKeys("Description by ThuyDuong");
	}
	public void clickbtnSubmit() {
		btnSubmit.click();
	}
	
	
}
