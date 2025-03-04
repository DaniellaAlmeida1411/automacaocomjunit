package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By CampoCpf = By.cssSelector("#field-cpf");
	private By BtnContinuar = By.xpath("//*[@id=\"test\"]");
	private By CampoNome = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/div[3]/label/input");
	private By CampoCelular = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/div[4]/label/input");
	private By CampoEmail = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/div[5]/label/input");
	private By CampoConfirmacaoEmail = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div/div[2]/div/div[6]/label/input");
	private By BtnCheckbox = By.xpath("//*[@id=\"label-accepted\"]");
	private By BtnEnviar = By.xpath("//*[@id=\"complete-form-drawer\"]/div/div/div[2]/form/div/div[2]/div/button");
	
	
	public By getCampoCpf() {
		return CampoCpf;
	}
	public By getBtnContinuar() {
		return BtnContinuar;
	}
	public By getCampoNome() {
		return CampoNome;
	}
	public By getCampoCelular() {
		return CampoCelular;
	}
	public By getCampoEmail() {
		return CampoEmail;
	}
	public By getCampoConfirmacaoEmail() {
		return CampoConfirmacaoEmail;
	}
	public By getBtnCheckbox() {
		return BtnCheckbox;
	}
	
	
	public By getBtnEnviar() {
		return BtnEnviar;
	}
	public void setBtnEnviar(By btnEnviar) {
		BtnEnviar = btnEnviar;
	}

	
	
}
