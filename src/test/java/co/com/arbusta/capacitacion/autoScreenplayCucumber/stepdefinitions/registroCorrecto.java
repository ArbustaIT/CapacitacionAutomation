package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.SeCreoUsuario;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.registrarseCorrectamente;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.registroUserInterfaces;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class registroCorrecto {
	
		@Managed(driver = "chrome")
		public WebDriver driver;
		
		private registroUserInterfaces page;
		
		Actor levadura = Actor.named("levadura");

    @Given("^que el navegante se encuentra en la pagina de automationpractice$")
    public void que_el_navegante_se_encuentra_en_la_pagina_de_automationpractice() throws Throwable {
    	
        levadura.can(BrowseTheWeb.with(driver));
    }

    @When("^el navegante se registra correctamente$")
    public void el_navegante_se_registra_correctamente() throws Throwable {
        
    	levadura.attemptsTo(registrarseCorrectamente.paraRegistrarse());
    }

    @Then("^se crea un usuario$")
    public void se_crea_un_usuario() throws Throwable {
    	
        levadura.should(seeThat(SeCreoUsuario.alRegistrarse()));
    }
}
