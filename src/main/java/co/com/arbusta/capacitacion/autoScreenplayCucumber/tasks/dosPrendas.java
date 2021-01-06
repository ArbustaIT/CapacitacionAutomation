package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class dosPrendas implements Task {

	public  dosPrendas () {	}
	
	@Step
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				Click.on(UIprendas.PRIMER_PRENDA),
				Click.on(UIprendas.SEGUNDA_PRENDA)

			);
	}
	
	public static dosPrendas selecciona() {
		return Tasks.instrumented(dosPrendas.class);
	}
	
}