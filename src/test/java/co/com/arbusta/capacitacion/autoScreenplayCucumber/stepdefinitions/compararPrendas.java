package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.BuscarPalabra;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.HomeWikiPage;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.categoryAutomationPractice;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class compararPrendas {

	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private categoryAutomationPractice page;
	Actor levadura = Actor.named("levadura");
	
	@Before
	public void SetUp() {
		levadura.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	levadura.attemptsTo(IrA.automationPractice(page));

	}
	
    @Given("^que el usuario seleccionó una prenda para comparar$")
    public void que_el_usuario_seleccion_una_prenda_para_comparar() throws Throwable {
    	
    }

    @Given("^que el usuario seleccionó dos prendas para comparar$")
    public void que_el_usuario_seleccion_dos_prendas_para_comparar() throws Throwable {
        throw new PendingException();
    }

    @Given("^que el usuario seleccionó tres prendas para comparar$")
    public void que_el_usuario_seleccion_tres_prendas_para_comparar() throws Throwable {
        throw new PendingException();
    }

    @When("^ingreso al comparador$")
    public void ingreso_al_comparador() throws Throwable {
        throw new PendingException();
    }

    @When("^selecciono una cuarta prenda$")
    public void selecciono_una_cuarta_prenda() throws Throwable {
        throw new PendingException();
    }

    @Then("^se visualiza un cartel advirtiendo que falta otra prenda$")
    public void se_visualiza_un_cartel_advirtiendo_que_falta_otra_prenda() throws Throwable {
        throw new PendingException();
    }

    @Then("^se visualiza una columna por prenda con la información respectiva$")
    public void se_visualiza_una_columna_por_prenda_con_la_informacin_respectiva() throws Throwable {
        throw new PendingException();
    }

    @Then("^se impide agregar la prenda y se despliega un cartel de advertencia$")
    public void se_impide_agregar_la_prenda_y_se_despliega_un_cartel_de_advertencia() throws Throwable {
        throw new PendingException();
    }
    
}
	
  
