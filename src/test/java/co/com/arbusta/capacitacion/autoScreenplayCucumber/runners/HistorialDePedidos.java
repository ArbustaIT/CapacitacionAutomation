package co.com.arbusta.capacitacion.autoScreenplayCucumber.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		//tags="@tag3",
        features = "src/test/resources/features/HistorialPedidos.feature",
        glue = {"co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions"})	
public class HistorialDePedidos {}

