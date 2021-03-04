package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UILogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

public class PedirNuevaContraseña implements Task {

	public  PedirNuevaContraseña () {	}
	
	@Step
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				Scroll.to(UILogin.BOX_sectorLogin),
				Click.on(UILogin.BTN_olvide_la_pass),
				Scroll.to(UILogin.BOX_sectorRecupero),
				Enter.theValue("lorem555@ipsum.es").into(UILogin.CMP_email),
				Click.on(UILogin.BTN_forgot_pass)
			);
	}
	
	public static PedirNuevaContraseña paraCambiarContraseña() {
		return Tasks.instrumented(PedirNuevaContraseña.class);
	}

}
