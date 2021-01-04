package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.loginUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class PedirNuevaContraseña implements Task {

	public  PedirNuevaContraseña () {	}
	
	@Step
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				Click.on(loginUserInterfaces.BTN_olvide_la_pass),
				Enter.theValue("lorem555@ipsum.es").into(loginUserInterfaces.CMP_email),
				Click.on(loginUserInterfaces.BTN_forgot_pass)
			);
	}
	
	public static PedirNuevaContraseña paraCambiarContraseña() {
		return Tasks.instrumented(PedirNuevaContraseña.class);
	}

}
