package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class compara implements Task {

	public  compara () {	}
	
	@Step
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				Click.on(UIprendas.BTN_COMPARE)
			);
	}
	
	public static compara prenda() {
		return Tasks.instrumented(compara.class);
	}
	
}
