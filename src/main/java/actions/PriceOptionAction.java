package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.PriceOptionPage;
import utils.DriverContext;



public class PriceOptionAction extends PriceOptionPage {
	
	protected WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor)DriverContext.getDriver();
	
	public PriceOptionAction() {
		wait =  new WebDriverWait(DriverContext.getDriver() , 50);	
	}
	
	public void selecionarPlano(String price) { 
		if (price.equals("Silver")) {	
			wait.until(ExpectedConditions.elementToBeClickable(checkSilver)).click();	
		} else if (price.equals("Gold")) {
			wait.until(ExpectedConditions.elementToBeClickable(checkGold)).click();	
		} else if (price.equals("Platinum")) {
			wait.until(ExpectedConditions.elementToBeClickable(checkPlatinum)).click();	
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(checkUltimate)).click();	
		} 
	}
	
	public void clicarDownloadQuote() {
		wait.until(ExpectedConditions.visibilityOf(btnDownloadQuote)).click();	
	}
	public void clicarSendQuote() {
		wait.until(ExpectedConditions.visibilityOf(btnSendQuote)).click();	
	}
} 
	 
	 
	 
	
