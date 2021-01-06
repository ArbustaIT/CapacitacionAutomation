package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.comparadorDePrendas;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.compara;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.dosPrendas;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class prendasCompararDosPrendas {

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
	
    @Given("^que el usuario seleccionó dos prendas para comparar$")
    public void que_el_usuario_seleccion_dos_prendas_para_comparar() throws Throwable {
    	levadura.attemptsTo(dosPrendas.selecciona());
    }

    @When("^ingreso al comparador$")
    public void ingreso_al_comparador() throws Throwable {
        levadura.attemptsTo(compara.prenda());
    }

    @Then("^se visualiza una columna por prenda con la información respectiva$")
    public void se_visualiza_una_columna_por_prenda_con_la_informacin_respectiva() throws Throwable {
    	levadura.should(seeThat(comparadorDePrendas.redireccionaA()));

    }

}
	
  
