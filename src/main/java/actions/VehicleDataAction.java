package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.VehicleDataPage;
import utils.DriverContext;



public class VehicleDataAction extends VehicleDataPage {
	
	protected WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor)DriverContext.getDriver();
	
	
	public VehicleDataAction() {
		wait =  new WebDriverWait(DriverContext.getDriver() , 10);
		
	}
	
	public void selecionarMake(String make) { Select boxMake = new Select(selectMake);
	boxMake.selectByValue(make); 
	}
	public void selecionarModel(String model) { Select boxModel = new Select(selectModel);
	boxModel.selectByValue(model); 
	}
	public void preencherCCM(String ccm) {
		wait.until(ExpectedConditions.visibilityOf(txtCylinderCapacity)).sendKeys(ccm); 
	}
	public void preencherKW(String kW) {
		wait.until(ExpectedConditions.visibilityOf(txtEnginePerformance)).sendKeys(kW); 
	}
	public void escolherData() {
		wait.until(ExpectedConditions.elementToBeClickable(clickCalendar)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clickDateManufacture)).click();
	}
	public void selecionarNumeroLugares(String seats) { Select boxSeat = new Select(selectSeats);
	boxSeat.selectByValue(seats); 
	}
	public void clicarMaoDireita(String RHD) { 
		if (RHD.equalsIgnoreCase("YES")) {
			wait.until(ExpectedConditions.elementToBeClickable(checkRHDYes)).click();
      
    } else {
        
        wait.until(ExpectedConditions.elementToBeClickable(checkRHDNo)).click();
    	}
	}
	public void selecionarNumeroLugaresMotocicleta(String seats2) { Select boxSeat2 = new Select(selectSeats2);
	boxSeat2.selectByValue(seats2); 
	}
	public void selecionarCombustivel(String combustivel) { Select boxCombustivel = new Select(selectFuel);
	boxCombustivel.selectByValue(combustivel); 
	}
	public void preencherCargaUtil(String KG) {
		wait.until(ExpectedConditions.visibilityOf(txtPayload)).sendKeys(KG); 
	}
	public void preencherPesoTotal(String weightKG) {
		wait.until(ExpectedConditions.visibilityOf(txtTotalWeight)).sendKeys(weightKG); 
	}
	public void preencherPrecoTabela(String listPrice) {
		wait.until(ExpectedConditions.visibilityOf(txtListPrice)).sendKeys(listPrice); 
	}
	public void preencherNumeroPlaca(String licensePlateNumber) {
		wait.until(ExpectedConditions.visibilityOf(txtLicensePlateNumber)).sendKeys(licensePlateNumber); 
	}
	public void preencherQuilometragemAnual(String annualMileage) {
		wait.until(ExpectedConditions.visibilityOf(txtAnnualMileage)).sendKeys(annualMileage); 
	}
	public void clicarFormInsurantData() {
		wait.until(ExpectedConditions.visibilityOf(buttonmNextInsurantData)).click(); 
	}
	
} 
	 
	 
	 
	
