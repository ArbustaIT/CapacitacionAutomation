package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.advertenciaCuartaPrenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.cuartaPrenda;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.tresPrendas;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class prendasSeleccionarMasDeTresPrendas {

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
	
    @Given("^que el usuario seleccionó tres prendas para comparar$")
    public void que_el_usuario_seleccion_tres_prendas_para_comparar() throws Throwable {
    	levadura.attemptsTo(tresPrendas.selecciona());
    }

    @When("^selecciono una cuarta prenda$")
    public void selecciono_una_cuarta_prenda() throws Throwable {
        levadura.attemptsTo(cuartaPrenda.selecciona());
    }
    
    @Then("^se impide agregar la prenda y se despliega un cartel de advertencia$")
    public void se_impide_agregar_la_prenda_y_se_despliega_un_cartel_de_advertencia() throws Throwable {
   	 levadura.should(seeThat(advertenciaCuartaPrenda.seMuestra()));

    }
    
}
	
  
