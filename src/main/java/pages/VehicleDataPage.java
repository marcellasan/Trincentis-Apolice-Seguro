package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class VehicleDataPage {
	
	public VehicleDataPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
		
	}
	
	
	@FindBy(how=How.ID_OR_NAME , using="make")
	protected WebElement selectMake;
	
	@FindBy(how=How.ID_OR_NAME , using="model")
	protected WebElement selectModel;
	
	@FindBy(how=How.ID , using="cylindercapacity")
	protected WebElement txtCylinderCapacity;
	
	@FindBy(how=How.ID , using="engineperformance")
	protected WebElement txtEnginePerformance;
	
	@FindBy(how=How.ID , using="opendateofmanufacturecalender")
	protected WebElement clickCalendar;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT , using="7")
	protected WebElement clickDateManufacture;
		
	@FindBy (how=How.ID, using="numberofseats")
	protected WebElement selectSeats;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[7]/p[1]/label[1]/span[1]")
	protected WebElement checkRHDYes;
	
	@FindBy (how=How.XPATH, using="//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[7]/p[1]/label[2]/span[1]")
	protected WebElement checkRHDNo;
	
	@FindBy (how=How.ID, using="numberofseatsmotorcycle")
	protected WebElement selectSeats2;
	
	@FindBy (how=How.ID, using="fuel")
	protected WebElement selectFuel;

	@FindBy (how=How.ID, using="payload")
	protected WebElement txtPayload;
	
	@FindBy (how=How.ID, using="totalweight")
	protected WebElement txtTotalWeight;
	
	@FindBy (how=How.ID, using="listprice")
	protected WebElement txtListPrice;
	
	@FindBy (how=How.ID, using="licenseplatenumber")
	protected WebElement txtLicensePlateNumber;
	
	@FindBy (how=How.ID, using="annualmileage")
	protected WebElement txtAnnualMileage;
	
	@FindBy (how=How.ID, using="nextenterinsurantdata")
	protected WebElement buttonmNextInsurantData;
	
	
	/*
	 * @FindBy(how=How.ID , using="SubmitCreate") protected WebElement
	 * btnCreateAccount;
	 * 
	 * @FindBy(how=How.ID , using="uniform-id_gender2") protected WebElement
	 * checkGender;
	 * 
	 * @FindBy(how=How.ID_OR_NAME , using="customer_firstname") protected WebElement
	 * txtNome;
	 * 
	 * @FindBy(how=How.ID_OR_NAME , using="customer_lastname") protected WebElement
	 * txtSobrenome;
	 * 
	 * @FindBy(how=How.ID , using="passwd") protected WebElement txtSenha;
	 * 
	 * @FindBy(how=How.ID , using="days") protected WebElement boxDays;
	 * 
	 * @FindBy(how=How.ID , using="months") protected WebElement boxMonths;
	 * 
	 * @FindBy(how=How.ID , using="years") protected WebElement boxYears;
	 * 
	 * @FindBy(how=How.ID , using="uniform-newsletter") protected WebElement
	 * boxNews;
	 * 
	 * @FindBy(how=How.ID , using="uniform-optin") protected WebElement boxOptin;
	 * 
	 * @FindBy(how=How.ID , using="address1") protected WebElement txtEndereco;
	 * 
	 * @FindBy(how=How.ID , using="city") protected WebElement txtCidade;
	 * 
	 * @FindBy(how=How.ID , using="id_state") protected WebElement boxState;
	 * 
	 * @FindBy(how=How.ID , using="postcode") protected WebElement txtCep;
	 * 
	 * @FindBy(how=How.ID , using="id_country") protected WebElement boxCountry;
	 * 
	 * @FindBy(how=How.ID , using="phone_mobile") protected WebElement
	 * txtNumCelular;
	 * 
	 * @FindBy(how=How.ID , using="alias") protected WebElement txtEmailAlt;
	 * 
	 * @FindBy(how=How.ID , using="submitAccount") protected WebElement btnRegister;
	 * 
	 * @FindBy(how=How.ID , using="submitAccount") protected WebElement txtMensagem;
	 */
	
	
		

}



