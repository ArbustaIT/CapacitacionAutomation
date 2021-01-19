package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Loguearse;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.PedirNuevaContraseña;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIlogin;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class Login {

		@Managed(driver = "chrome")
		public WebDriver driver;
		
		private UIlogin page;
		
		Actor Cristian = Actor.named("Cristian");
	
	@Before
	public void SetUp() {
		Cristian.can(BrowseTheWeb.with(driver));
	}
	
	@Given("^que el usuario se encuentra en la pagina$")
	public void que_el_usuario_se_encuentra_en_la_pagina() {
		Cristian.attemptsTo(IrA.automationPractice(page));
	}

    @When("^el usuario ingresa las credenciales$")
    public void el_usuario_ingresa_las_credenciales() {
    	Cristian.attemptsTo(Loguearse.correctamente("lorem555@ipsum.es","12345678"));
    }

    @Then("^ingresa correctamente a la aplicación de automationpractice$")
    public void ingresa_correctamente_a_la_aplicacin_de_automationpractice() {
    }
    
    //Validación Login Fallido 
    @When("^el usuario ingresa las credenciales incorrectas$")
    public void el_usuario_ingresa_las_credenciales_incorrectas() {
    	Cristian.attemptsTo(Loguearse.correctamente("lorem555@ipsum.es", "incorrecto"));
    }

    @Then("^la aplicación despliega un cartel de error$")
    public void la_aplicacin_despliega_un_cartel_de_error() {
    }
    
    //Nueva Contraseña
    @When("^el usuario ingresa las credenciales fallidas$")
    public void el_usuario_ingresa_las_credenciales_fallidas() {
    	Cristian.attemptsTo(Loguearse.correctamente("lorem555@ipsum.es", "incorrecto"));
    }
    
    @And("^pide contraseña nueva$")
    public void pide_contrasea_nueva() {
    	Cristian.attemptsTo(PedirNuevaContraseña.paraCambiarContraseña());
    }

    @Then("^se despliega un mensaje de email de recupero enviado$")
    public void se_despliega_un_mensaje_de_email_de_recupero_enviado() {
    }
}
