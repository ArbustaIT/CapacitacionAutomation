package co.com.arbusta.capacitacion.autoScreenplayCucumber.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/CarritoDeCompra.feature",
        glue = {"co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions"})	
public class CarritoCompra {

}
	