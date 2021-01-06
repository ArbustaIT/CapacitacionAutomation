package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.marcaErroresEnCampos;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.registrarseIncorrectamente;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIregistro;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class registroIncorrecto {
	
		@Managed(driver = "chrome")
		public WebDriver driver;
			
		private UIregistro page;
			
		Actor levadura = Actor.named("levadura");

    @Given("^que el navegante se encuentra en la pagina de automationpractice$")
    public void que_el_navegante_se_encuentra_en_la_pagina_de_automationpractice() throws Throwable {
    	
        levadura.can(BrowseTheWeb.with(driver));
    }

    @When("^el navegante se registra incorrectamente$")
    public void el_navegante_se_registra_incorrectamente() throws Throwable {
    	
        levadura.attemptsTo(registrarseIncorrectamente.paraRebotar());
    }

    @Then("^el proceso de ingreso marca los campos de error$")
    public void el_proceso_de_ingreso_marca_los_campos_de_error() throws Throwable {

        levadura.should(seeThat(marcaErroresEnCampos.alQuererRegistrarse()));
}

}
