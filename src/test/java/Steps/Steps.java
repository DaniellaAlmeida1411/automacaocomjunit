package Steps;

import org.openqa.selenium.WebDriver;

import Elementos.Elementos;
import Elementos.ElementosBancoInter;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
  
	Metodos m = new Metodos();
	Elementos e = new Elementos();
	ElementosBancoInter b = new ElementosBancoInter();
	
	
	
	
	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String url) {
	 m.abrirNavegador("https://nubank.com.br/");
	 
	}

	@When("quando digitar o cpf")
	public void quando_digitar_o_cpf() {
	 m.preencherCampo("155.162.100-20", e.getCampoCpf());
	}

	@When("clicar no botão continuar")
	public void clicar_no_botão_continuar() throws InterruptedException {
	 m.clicar(e.getBtnContinuar());  
	 
	 Thread.sleep(5000);
	}

	@When("preencher os campos obrigatorios")
	public void preencher_os_campos_obrigatorios() {
		
	  m.preencherCampo("Daniella Almeida", e.getCampoNome());
	  m.preencherCampo("11973394197", e.getCampoCelular());
	  m.preencherCampo("daniella@yahoo.com.br", e.getCampoEmail());
	  m.preencherCampo("daniella@yahoo.com.br", e.getCampoConfirmacaoEmail());
	  
	}

	@When("selecionar o ckeckbox")
	public void selecionar_o_ckeckbox() {
	   m.clicar(e.getBtnCheckbox());
	   m.clicar(e.getBtnEnviar());
	}

	@Then("aparecerá mensagem de acesso ao email para continuar cadastro")
	public void aparecerá_mensagem_de_acesso_ao_email_para_continuar_cadastro() {
	   
	}
	
	@Given("que acesse o site  a url {string}")
	public void que_acesse_o_site_a_url(String string) {
	   m.abrirNavegador(string); 
	}

	
	
	
	@When("preencher todos os campos")
	public void preencher_todos_os_campos() throws InterruptedException {
	    m.clicar(b.getCampoAbrirConta());
	    Thread.sleep(3000);
	    m.preencherCampo("Daniella", b.getCampoNome());
	    m.preencherCampo("10.338.738/0001-17", b.getCampoCnpj());
	    m.clicar(b.getCheckBox());
	    m.clicar(b.getBtnContinuar());
	    Thread.sleep(3000);
	    m.preencherCampo("daniella@yahoo.com.br", b.getCampoEmail1());
	    m.clicar(b.getBtnContinuar1());
	}
	

	@Then("conta PJ será criada com sucesso")
	public void conta_pj_será_criada_com_sucesso() {
	    
	}

}
