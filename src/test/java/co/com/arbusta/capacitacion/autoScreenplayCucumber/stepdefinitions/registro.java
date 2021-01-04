rpackage co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.registrarse;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.registroUserInterfaces;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class registro {
	
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
        
    	levadura.attemptsTo(registrarse.correctamente);
    }

    @When("^el navegante se registra incorrectamente$")
    public void el_navegante_se_registra_incorrectamente() throws Throwable {
        levadura.attemptsTo(registrarse.incorrectamente);
    }

    @Then("^se crea un usuario$")
    public void se_crea_un_usuario() throws Throwable {
        throw new PendingException();
    }

    @Then("^el proceso de ingreso marca los campos de error$")
    public void el_proceso_de_ingreso_marca_los_campos_de_error() throws Throwable {
        throw new PendingException();
    }

}
