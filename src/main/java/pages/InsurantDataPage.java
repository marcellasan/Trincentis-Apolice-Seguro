package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class InsurantDataPage {
	
	public InsurantDataPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		
	}
	@FindBy(how=How.ID_OR_NAME , using="firstname")
	protected WebElement txtFirstName;
	
	@FindBy(how=How.ID_OR_NAME , using="lastname")
	protected WebElement txtLastName;

	@FindBy(how=How.ID , using="birthdate")
	protected WebElement txtCalendarBirth;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[1]/span[1]")
	protected WebElement checkMale;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[2]/span[1]")
	protected WebElement checkFemale;

	@FindBy(how=How.ID , using="streetaddress")
	protected WebElement txtAdress;
	
	@FindBy(how=How.ID , using="country")
	protected WebElement selectCountry;
	
	@FindBy(how=How.ID , using="zipcode")
	protected WebElement txtZipCode;

	@FindBy(how=How.ID , using="city")
	protected WebElement txtCity;
	
	@FindBy(how=How.ID , using="occupation")
	protected WebElement selectOccupation;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[1]/span[1]")
	protected WebElement checkSpeeding;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[2]/span[1]")
	protected WebElement checkBungeeJump;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[3]/span[1]")
	protected WebElement checkCliffDiving;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[4]/span[1]")
	protected WebElement checkSkydiving;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[5]/span[1]")
	protected WebElement checkOther;
	
	@FindBy (how=How.ID, using="website")
	protected WebElement txtWebsite;
	
	@FindBy (how=How.ID, using="open")
	protected WebElement btnOpenPicture;
	
	@FindBy (how=How.ID, using="picture")
	protected WebElement txtPicture;	
	
	@FindBy (how=How.ID, using="nextenterproductdata")
	protected WebElement btnProductData;
	
	
}



