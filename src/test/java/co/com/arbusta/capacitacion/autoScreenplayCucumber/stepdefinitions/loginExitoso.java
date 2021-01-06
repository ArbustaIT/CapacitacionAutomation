package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.Ingreso;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.Login;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class loginExitoso {

		@Managed(driver = "chrome")
		public WebDriver driver;
		
		private UIprendas page;
		
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
    

    @Then("^ingresa correctamente a la aplicación de automationpractice$")
    public void ingresa_correctamente_a_la_aplicacion_de_automationpractice() throws Throwable {
        levadura.should(seeThat(Ingreso.Exitoso()));
    }

}
