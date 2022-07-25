package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class ProductDataPage {
	
	public ProductDataPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		
	}
	@FindBy(how=How.ID , using="startdate")
	protected WebElement txtStartDate;
	
	@FindBy(how=How.ID , using="insurancesum")
	protected WebElement selectInsuranceSum;

	@FindBy(how=How.ID , using="meritrating")
	protected WebElement selectMeritRating;
	
	@FindBy(how=How.ID , using="damageinsurance")
	protected WebElement selectDamageInsurance;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[5]/p[1]/label[1]/span[1]")
	protected WebElement checkEuroProtection;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[5]/p[1]/label[2]/span[1]")
	protected WebElement checkLegalDefenseInsurance;

	@FindBy(how=How.ID , using="courtesycar")
	protected WebElement selectCourtesyCar;
	
	@FindBy (how=How.ID, using="nextselectpriceoption")
	protected WebElement btnPriceOption;
	
	
}



