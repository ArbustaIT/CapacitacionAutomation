package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.CompraFallida;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IngresarA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IniciarSesion;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Prenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.compra;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CarritoDeCompra {

	@Managed(driver = "chrome")
	public WebDriver driver;

	private HomePage page;

	Actor usuario = Actor.named("usuario");

	@Before
	public void SetUp() {
		usuario.can(BrowseTheWeb.with(driver));
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Given("^que el usuario se encuentra en la pagina de automationpractice$")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_automationpractice(){
		usuario.attemptsTo(IngresarA.automationPractice(page));
		System.out.print("Abri la pagina");
		
    }
	
	@When("^confirma la orden$")
	public void confirma_la_orden() {
		System.out.print("Abri la pagina");
		usuario.attemptsTo(IniciarSesion.diligenciaFormularioEn(page));
		usuario.attemptsTo(Prenda.añadir());
		usuario.attemptsTo(compra.completar());
	}

	@Then("^se muestran los datos de la orden de compra$")
	public void se_muestran_los_datos_de_la_orden_de_compra() {
		System.out.print("Abri la pagina");
	}

	@Given("^que el usuario inicia una compra sin estar logueado$")
	public void que_el_usuario_inicia_una_compra_sin_estar_logueado() {
		usuario.can(BrowseTheWeb.with(driver));
		usuario.attemptsTo(IngresarA.automationPractice(page));
		System.out.print("Abri la pagina");
	}

	@When("^se inicia el flujo de compra$")
	public void se_inicia_el_flujo_de_compra() {
		usuario.attemptsTo(Prenda.añadir());
		usuario.attemptsTo(CompraFallida.SinUsuario());
		System.out.print("Abri la pagina");
	}

	@Then("^se despliega en el flujo las opciones de registrarse e iniciar sesión$")
	public void se_despliega_en_el_flujo_las_opciones_de_registrarse_e_iniciar_sesin() {
		System.out.print("Abri la pagina");
	}
}
