package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class tresPrendas implements Task {

	public  tresPrendas () {	}
	
	@Step
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				Click.on(UIprendas.PRIMER_PRENDA),
				Click.on(UIprendas.SEGUNDA_PRENDA),
				Click.on(UIprendas.TERCER_PRENDA)

			);
	}
	
	public static tresPrendas selecciona() {
		return Tasks.instrumented(tresPrendas.class);
	}
	
}