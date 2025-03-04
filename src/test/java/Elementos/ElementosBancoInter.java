package Elementos;

import org.openqa.selenium.By;

public class ElementosBancoInter {

	private By CampoAbrirConta = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/button[1]");
	private By CampoNome = By.name("nome");
	private By CampoCnpj = By.id("cnpj");
	private By CheckBox = By.cssSelector("body > div.styles__ModalHomeStyle-sc-1u4f4ed-0.khbVdG > form > label > div.sc-ikkxIA.hVxzFv > svg");
	private By BtnContinuar = By.xpath("/html/body/div[2]/form/div[3]/button");
	private By CampoEmail1 = By.id("email");
	private By BtnContinuar1 = By.cssSelector("body > div.styles__ModalHomeStyle-sc-1u4f4ed-0.khbVdG > form > div.styles__Container-sc-fs5otj-0.cIJGAM > button");
	
	
	
	public By getCampoAbrirConta() {
		return CampoAbrirConta;

	}
	public By getCampoNome() {
		return CampoNome;
	}
	public By getCampoCnpj() {
		return CampoCnpj;
	}
	public By getCheckBox() {
		return CheckBox;
	}
	public By getBtnContinuar() {
		return BtnContinuar;
	}
	public By getBtnContinuar1() {
		return BtnContinuar1;
	}
	public void setBtnContinuar1(By btnContinuar1) {
		BtnContinuar1 = btnContinuar1;
	}

	
	public By getCampoEmail1() {
		return CampoEmail1;
	}
	public void setCampoEmail1(By campoEmail1) {
		CampoEmail1 = campoEmail1;
	}
	
	

}
