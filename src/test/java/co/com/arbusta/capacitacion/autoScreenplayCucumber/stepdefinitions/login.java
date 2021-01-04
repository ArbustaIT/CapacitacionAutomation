package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.HuboError;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.Ingreso;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.SeMuestra;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IngresarIncorrectamente;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Login;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.PedirNuevaContraseña;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.categoryAutomationPractice;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class login {

	//plataforma: navegador
	@Managed(driver = "chrome")
	public WebDriver driver;
	
	//variable de la pagina
	private categoryAutomationPractice page;
	
	//actor
	Actor levadura = Actor.named("levadura");
	
	@Before
	public void SetUp() {
		levadura.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
    @Given("^que el usuario se encuentra en la pagina de automationpractice$")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_automationpractice() throws Throwable {
        levadura.attemptsTo(IrA.automationPractice(page));
    }

    @When("^el usuario ingresa las credenciales$")
    public void el_usuario_ingresa_las_credenciales() throws Throwable {
       levadura.attemptsTo(Login.paraLoguearse());
    }
    
    @When("^el usuario ingresa las credenciales incorrectas$")
    public void el_usuario_ingresa_las_credenciales_incorrectas() throws Throwable {
        levadura.attemptsTo(IngresarIncorrectamente.paraVolverAIntentar());
    }
    
	    @And("^pide contraseña nueva$")
	    public void pide_contraseña_nueva() throws Throwable {
	        levadura.attemptsTo(PedirNuevaContraseña.paraCambiarContraseña());
	    }

    @Then("^ingresa correctamente a la aplicación de automationpractice$")
    public void ingresa_correctamente_a_la_aplicacion_de_automationpractice() throws Throwable {
        levadura.should(seeThat(Ingreso.Exitoso()));
    }

    @Then("^la aplicación despliega un cartel de error$")
    public void la_aplicacion_despliega_un_cartel_de_error() throws Throwable {
        levadura.should(seeThat(HuboError.ParaEntrar()));
    }

    @Then("^se despliega un mensaje de email de recupero enviado$")
    public void se_despliega_un_mensaje_de_email_de_recupero_enviado() throws Throwable {
        levadura.should(seeThat(SeMuestra.verificacionDeEmailEnviado()));
    }


    
    

    
    
}
