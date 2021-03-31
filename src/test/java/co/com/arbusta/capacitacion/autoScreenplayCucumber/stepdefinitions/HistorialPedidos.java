package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IngresarA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IniciarSesion;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.MicuentaDetalles;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.MicuentaPDF;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.MicuentaReordenar;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Prenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class HistorialPedidos {
	@Managed(driver = "chrome")
	public WebDriver driver;

	Actor usuario = Actor.named("usuario");

	private HomePage page;

	@Before
	public void SetUp() {
		usuario.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
//	@Given("^que el usuario se encuentra en la pagina de autopractice$")
//    public void que_el_usuario_se_encuentra_en_la_pagina_de_autopractice(){
//		usuario.attemptsTo(IngresarA.automationPractice(page));
//    }
	
	@When("^accedo al PDF de una orden$")
	public void accedo_al_pdf_de_una_orden() {
		usuario.attemptsTo(IniciarSesion.diligenciaFormularioEn(page));
		usuario.attemptsTo(Prenda.añadir());
        usuario.attemptsTo(MicuentaPDF.descargar(page));
	System.out.print("Ingreso a la descargar");
	}
	

	@Then("^se descarga la orden en PDF$")
	public void se_descarga_la_orden_en_pdf() {
		System.out.print("Se descargo");
	}
	
	@When("^selecciono el detalle de una orden$")
    public void selecciono_el_detalle_de_una_orden(){
		System.out.print("aaaa");
		usuario.attemptsTo(IniciarSesion.diligenciaFormularioEn(page));
		usuario.attemptsTo(Prenda.añadir());
	    usuario.attemptsTo(MicuentaDetalles.visualizar(page));
		System.out.print("Ingreso a visualizar");
    }

    @Then("^se despliega la información de la orden$")
    public void se_despliega_la_informacin_de_la_orden(){
        System.out.print("bb");
    }

	@When("^selecciono reordenar en una orden$")
	public void selecciono_reordenar_en_una_orden() {
		System.out.print("aaaa");
		usuario.attemptsTo(IniciarSesion.diligenciaFormularioEn(page));
		usuario.attemptsTo(Prenda.añadir());
		usuario.attemptsTo(MicuentaReordenar.dirigir(page));
	}

	@Then("^me redirecciona al proceso de compra$")
	public void me_redirecciona_al_proceso_de_compra() {

	}
}
