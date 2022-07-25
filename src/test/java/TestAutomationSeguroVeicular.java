import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import actions.InsurantDataAction;
import actions.VehicleDataAction;
import actions.ProductDataAction;
import actions.PriceOptionAction;
import actions.QuoteAction;
import utils.Constants;
import utils.DriverContext;

class TestAutomationSeguroVeicular {
	WebDriver driver;
	VehicleDataAction vehicle;
	InsurantDataAction insurant;
	ProductDataAction product;
	PriceOptionAction price;
	QuoteAction quote;

	
    @Rule
	public TestName test = new TestName();
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver()	;
		driver.get("http://sampleapp.tricentis.com/101/app.php"); // Acessa o site
		driver.manage().window().maximize(); //Maximiza a tela
		DriverContext.setDriver(driver);
		vehicle = new VehicleDataAction();
		insurant = new InsurantDataAction();
		product = new ProductDataAction();
		price = new PriceOptionAction();
		quote = new QuoteAction();
	}

	@Test
	void testDadosVeiculo() {
		assertEquals("Enter Vehicle Data", driver.getTitle());
		System.out.println("Insira os Dados do Veículo ");
		vehicle.selecionarMake("Toyota");
		vehicle.selecionarModel("Moped");
		vehicle.preencherCCM("150");
		vehicle.preencherKW("120");
		vehicle.escolherData();
		vehicle.selecionarNumeroLugares("5");
		vehicle.clicarMaoDireita("Yes");
		vehicle.selecionarNumeroLugaresMotocicleta("1");
		vehicle.selecionarCombustivel("Gas");
		vehicle.preencherCargaUtil("165");
		vehicle.preencherPesoTotal("200");
		vehicle.preencherPrecoTabela("45000");
		vehicle.preencherNumeroPlaca("XYZ-5698");
		vehicle.preencherQuilometragemAnual("10000");
		vehicle.clicarFormInsurantData();
	
		assertEquals("Enter Insurant Data", driver.getTitle());
		System.out.println("Insira os Dados do Seguro");
		insurant.preencherNome("Joao");
		insurant.preencherSobrenome("Padua	");
		insurant.preencherDataAniversario("02/17/1979");
		insurant.clicarGenero("Male");
		insurant.preencherEndereco("Rua das Orquideas numero 75");
		insurant.selecionarCountry("Brazil");
		insurant.preencherCodPostal("11560010");
		insurant.preencherCidade("São Paulo");
		insurant.selecionarOcupacao("Farmer");
		insurant.selecionarHobbies("Other");
		insurant.preencherWebsite("www.joao.com.br");
		insurant.clicaFormProductData();
		
		assertEquals("Enter Product Data", driver.getTitle());
		System.out.println("Insira os Dados do Produto");
		product.preencherDataInicial("01/01/2023");
		product.selecionarSomaSeguro("3000000");
		product.selecionarAvaliacaoMerito("Malus 17");
		product.selecionarSeguroDanos("Partial Coverage");
		product.clicarProdutosOpcionais("EURO");
		product.selecionarCortesia("Yes");
		product.clicaFormProductData();

		assertEquals("Select Price Option", driver.getTitle());
		System.out.println("Selecionar Opção de Preço");
		price.selecionarPlano("Gold");
		price.clicarSendQuote();
		
		assertEquals("Send Quote", driver.getTitle());
		System.out.println("Enviar Contação");
		quote.preencherEmail("joao@gmail.com");
		quote.preencherTelefone("1199564877");
		quote.preencherUsuario("JoaoX");
		quote.preencherSenha("Joao1234");
		quote.preencherConfirmaSenha("Joao1234");
		quote.preencherComentario("Comentario feito com sucesso!");
		quote.clicarEnviar();
	}

	//@Test
	void testDadosSeguradoa() {
		
	 }
	
//	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}


}
