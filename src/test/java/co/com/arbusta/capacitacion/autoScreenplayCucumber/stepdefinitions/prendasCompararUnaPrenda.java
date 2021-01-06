
package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.advertenciaUnaPrenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.compara;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.unaPrenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class prendasCompararUnaPrenda {

	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private UIprendas page;
	Actor levadura = Actor.named("levadura");
	
	@Before
	public void SetUp() {
		levadura.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	levadura.attemptsTo(IrA.automationPractice(page));

	}
	
    @Given("^que el usuario seleccionó una prenda para comparar$")
    public void que_el_usuario_seleccion_una_prenda_para_comparar() throws Throwable {
    	levadura.attemptsTo(unaPrenda.selecciona());
    }

    @When("^ingreso al comparador$")
    public void ingreso_al_comparador() throws Throwable {
        levadura.attemptsTo(compara.prenda());
    }

    @Then("^se visualiza un cartel advirtiendo que falta otra prenda$")
    public void se_visualiza_un_cartel_advirtiendo_que_falta_otra_prenda() throws Throwable {
    	 levadura.should(seeThat(advertenciaUnaPrenda.seMuestra()));
    }
    
}
	
  
