$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PesquisarDados.feature");
formatter.feature({
  "name": "Pesquisar assunto no site",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Pesquisar dado",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CE001"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario acesse o site",
  "keyword": "Dado "
});
formatter.match({
  "location": "PesquisarDadosSteps.queOUsuarioAcesseOSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario pesquise o assunto \"Automacao de Testes\"",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisarDadosSteps.oUsuarioPesquiseOAssunto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acione o botao de busca",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisarDadosSteps.acioneOBotaoDeBusca()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema mostra o resultado da pesquisa",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisarDadosSteps.oSistemaMostraOResultadoDaPesquisa()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});