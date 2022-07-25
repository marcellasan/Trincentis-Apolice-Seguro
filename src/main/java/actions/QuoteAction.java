package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.QuotePage;
import utils.DriverContext;



public class QuoteAction extends QuotePage {
	
	protected WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor)DriverContext.getDriver();
	
	public QuoteAction() {
		wait =  new WebDriverWait(DriverContext.getDriver() , 50);	
	}
	public void preencherEmail(String email) { 
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email); ; 
	}
	public void preencherTelefone(String phone) {
		wait.until(ExpectedConditions.visibilityOf(txtPhone)).sendKeys(phone); 
	}
	public void preencherUsuario(String user) {
		wait.until(ExpectedConditions.visibilityOf(txtUsername)).sendKeys(user); 
	} 
	public void preencherSenha(String password) {
		wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password); 
	}
	public void preencherConfirmaSenha(String confirmPassword) {
		wait.until(ExpectedConditions.visibilityOf(txtConfirmPassword)).sendKeys(confirmPassword); 
	}
	public void preencherComentario(String comments) {
		wait.until(ExpectedConditions.visibilityOf(txtComments)).sendKeys(comments); 
	}
	public void clicarEnviar() {
		wait.until(ExpectedConditions.visibilityOf(btnSend)).click(); 
	}
	public void guardarTexto(String txtSend) {
		wait.until(ExpectedConditions.visibilityOf(txtSuccess)).getTagName();
	}

} 
	 
	 
	 
	
