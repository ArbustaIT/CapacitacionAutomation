package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class registrarseIncorrectamente implements Task {
	
	public registrarseIncorrectamente () {
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
		
		);
	} 
	
	public static registrarseIncorrectamente paraRebotar() {
		return Tasks.instrumented(registrarseIncorrectamente.class);
	}


}
