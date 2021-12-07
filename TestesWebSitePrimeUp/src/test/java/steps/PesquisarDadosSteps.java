package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.PesquisarDadosPage;

import static utils.Utils.*;

public class PesquisarDadosSteps {
	
	@Dado("que o usuario acesse o site")
	public void queOUsuarioAcesseOSite() {
           Na(PesquisarDadosPage.class).clicarBotaoPesquisa();	        
	}

	@Dado("o usuario pesquise o assunto {string}")
	public void oUsuarioPesquiseOAssunto(String dado) {
	   Na(PesquisarDadosPage.class).campoPesquisaDado(dado);
	}

	@Dado("acione o botao de busca")
	public void acioneOBotaoDeBusca() {
	   Na(PesquisarDadosPage.class).pesquisaDado();
	}

	@Entao("o sistema mostra o resultado da pesquisa")
	public void oSistemaMostraOResultadoDaPesquisa() {
	   Na(PesquisarDadosPage.class).apresentaMsgResultado();
	}

}
