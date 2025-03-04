#Author:

@FormularioAberturaDeConta
Feature: Formulario de Abertura de Conta
  

  @tag1
  Scenario: Validação de registro no banco Nubank
  
    Given que acesse o site "https://nubank.com.br/"
    When quando digitar o cpf
    And clicar no botão continuar
    And preencher os campos obrigatorios
    And selecionar o ckeckbox
    And clicar no botão continuar
    Then aparecerá mensagem de acesso ao email para continuar cadastro
    
    
    
   
@AberturaContaPj
Scenario: Abertura de conta PJ
Given que acesse o site  a url "https://conta-digital-pj.inter.co/login"
When preencher todos os campos
Then conta PJ será criada com sucesso