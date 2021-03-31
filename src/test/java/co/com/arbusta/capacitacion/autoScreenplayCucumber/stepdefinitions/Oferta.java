package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Banners;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IngresarA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class Oferta {
	@Managed(driver = "chrome")
	public WebDriver driver;

	Actor usuario = Actor.named("usuario");
	
	
	
	private HomePage page;

	@Before
	public void SetUp() {
		usuario.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	
//	@Given("^que el usuario se encuentra en la pagina de autompracti$")
//    public void que_el_usuario_se_encuentra_en_la_pagina_de_autompracti(){
//		usuario.can(BrowseTheWeb.with(driver));
//    	usuario.attemptsTo(IngresarA.automationPractice(page));
//    }
	
	@When("^el usuario selecciona una oferta$")
	public void el_usuario_selecciona_una_oferta() {
		usuario.attemptsTo(IngresarA.automationPractice(page));
		usuario.attemptsTo(Banners.visualizar());
	}

	@Then("^redirecciona a la pagina de la oferta$")
	public void redirecciona_a_la_pagina_de_la_oferta() {

	}
}
