package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PesquisarDadosPage {
	
	@FindBy(xpath = "//*[@id=\"search\"]/a/span")
	private WebElement botaoPesquisa;
    
	@FindBy(id = "s")
	private WebElement campoPesquisaDado;
	
	@FindBy(id = "searchsubmit")
	private WebElement btnPesquisaAssunto;
	
	@FindBy(linkText = "Automação de Testes")
	private WebElement msgResultado;
	
	public void clicarBotaoPesquisa() {
		botaoPesquisa.click();
	}

	public void campoPesquisaDado(String pesquisaDado) {
		campoPesquisaDado.sendKeys(pesquisaDado);
	}
	
	public void pesquisaDado() {
		btnPesquisaAssunto.click();
	}
	
	public void apresentaMsgResultado() {
		msgResultado.click();
	}
	
}
