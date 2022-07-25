package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class QuotePage {
	
	public QuotePage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		
	}
	@FindBy(how=How.ID_OR_NAME , using="email")
	protected WebElement txtEmail;
	
	@FindBy(how=How.ID_OR_NAME , using="phone")
	protected WebElement txtPhone;

	@FindBy(how=How.ID , using="username")
	protected WebElement txtUsername;

	@FindBy(how=How.ID , using="password")
	protected WebElement txtPassword;
	
	@FindBy(how=How.ID , using="confirmpassword")
	protected WebElement txtConfirmPassword;
	
	@FindBy(how=How.ID , using="Comments")
	protected WebElement txtComments;
	
	@FindBy(how=How.ID , using="sendemail")
	protected WebElement btnSend;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/h2")
	protected WebElement txtSuccess;
}



