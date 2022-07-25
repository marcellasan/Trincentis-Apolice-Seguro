package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ProductDataPage;
import utils.DriverContext;



public class ProductDataAction extends ProductDataPage {
	
	protected WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor)DriverContext.getDriver();
	
	public ProductDataAction() {
		wait =  new WebDriverWait(DriverContext.getDriver() , 50);	
	}
	public void preencherDataInicial(String startDate) { 
		wait.until(ExpectedConditions.visibilityOf(txtStartDate)).sendKeys(startDate); ; 
	}
	public void selecionarSomaSeguro(String sunInsurance) { Select boxInsurancies = new Select(selectInsuranceSum);
		boxInsurancies.selectByValue(sunInsurance); 
	}
	public void selecionarAvaliacaoMerito(String merito) { Select boxRating = new Select(selectMeritRating);
	boxRating.selectByValue(merito); 
	}	
	public void selecionarSeguroDanos(String damage) { Select boxDamage = new Select(selectDamageInsurance);
	boxDamage.selectByValue(damage); 
	}
		
	public void clicarProdutosOpcionais(String optional) { 
		if (optional.equalsIgnoreCase("EURO")) {
			wait.until(ExpectedConditions.elementToBeClickable(checkEuroProtection)).click();
			
		} else {
			
			wait.until(ExpectedConditions.elementToBeClickable(checkLegalDefenseInsurance)).click();
		}
	}
	public void selecionarCortesia(String courtesyCar) { Select boxCourtesies = new Select(selectCourtesyCar);
	boxCourtesies.selectByValue(courtesyCar); 
	}
	
	public void clicaFormProductData() {
		wait.until(ExpectedConditions.visibilityOf(btnPriceOption)).click();	
	}

} 
	 
	 
	 
	
