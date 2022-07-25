package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class PriceOptionPage {
	
	public PriceOptionPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		
	}
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[1]/span[1]")
	protected WebElement checkSilver;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[2]/span[1]")
	protected WebElement checkGold;

	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[3]/span[1]")
	protected WebElement checkPlatinum;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[4]/span[1]")
	protected WebElement checkUltimate;
	
	@FindBy (how=How.XPATH, using="/div[1]/form[1]/div[1]/section[4]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/span[1]")
	protected WebElement btnDownloadQuote;

	@FindBy (how=How.ID, using="nextsendquote")
	protected WebElement btnSendQuote;
	
	
	
}


