package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.InsurantDataPage;
import utils.DriverContext;



public class InsurantDataAction extends InsurantDataPage {
	
	protected WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor)DriverContext.getDriver();
	
	public InsurantDataAction() {
		wait =  new WebDriverWait(DriverContext.getDriver() , 50);	
	}
		public void preencherNome(String firstName) { 
		wait.until(ExpectedConditions.visibilityOf(txtFirstName)).sendKeys(firstName); ; 
	}
	public void preencherSobrenome(String lastName) {
		wait.until(ExpectedConditions.visibilityOf(txtLastName)).sendKeys(lastName); 
	}
	public void preencherDataAniversario(String birthDay) {
		wait.until(ExpectedConditions.visibilityOf(txtCalendarBirth)).sendKeys(birthDay); 
	} 
	public void clicarGenero(String gender) { 
		if (gender.equalsIgnoreCase("Male")) {
			wait.until(ExpectedConditions.elementToBeClickable(checkMale)).click();
			
		} else {
			
			wait.until(ExpectedConditions.elementToBeClickable(checkFemale)).click();
		}
	}
	public void preencherEndereco(String ende) {
		wait.until(ExpectedConditions.visibilityOf(txtAdress)).sendKeys(ende); 
	}
	public void selecionarCountry(String country) { Select boxCountries = new Select(selectCountry);
	boxCountries.selectByValue(country); 
	}
	public void preencherCodPostal(String zipCode) {
		wait.until(ExpectedConditions.visibilityOf(txtZipCode)).sendKeys(zipCode); 
	}
	public void preencherCidade(String city) {
		wait.until(ExpectedConditions.visibilityOf(txtCity)).sendKeys(city); 
	}
	public void selecionarOcupacao(String occupation) { Select boxOccupations = new Select(selectOccupation);
	boxOccupations.selectByValue(occupation); 
	}
	public void selecionarHobbies(String hobby) { 
		if (hobby.equals("Speeding")) {	
			wait.until(ExpectedConditions.elementToBeClickable(checkSpeeding)).click();	
		} else if (hobby.equals("Bungee Jumping")) {
			wait.until(ExpectedConditions.elementToBeClickable(checkBungeeJump)).click();	
		} else if (hobby.equals("Clif Diving")) {
			wait.until(ExpectedConditions.elementToBeClickable(checkCliffDiving)).click();	
		} else if (hobby.equals("Skydiving")) {
			wait.until(ExpectedConditions.elementToBeClickable(checkSkydiving)).click();	
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(checkOther)).click();	
		} 
	}
	public void preencherWebsite(String site) {
		wait.until(ExpectedConditions.visibilityOf(txtWebsite)).sendKeys(site);
	}
	public void uploadFoto2(String foto2) {
		
		wait.until(ExpectedConditions.visibilityOf(txtPicture)).sendKeys(foto2);
	}
	public void uploadFoto() {
		
		wait.until(ExpectedConditions.visibilityOf(txtPicture)).click();
		
	}
	public void clicaFormProductData() {
		
		wait.until(ExpectedConditions.visibilityOf(btnProductData)).click();	
	}
	


} 
	 
	 
	 
	
