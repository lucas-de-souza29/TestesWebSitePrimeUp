#language: pt
#enconding:  UTF-8

Funcionalidade: Pesquisar assunto no site

@CE001
Cenario: Pesquisar dado 

Dado que o usuario acesse o site
E o usuario pesquise o assunto "Automacao de Testes"
E acione o botao de busca
Entao o sistema mostra o resultado da pesquisa

