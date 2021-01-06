package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIlogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class IngresarIncorrectamente implements Task {

	public IngresarIncorrectamente () {
		
	}

	@Step("{0} Ingresar incorrectamente para volver a intentar")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
						Click.on(UIlogin.BTN_SingIn),
						Enter.theValue("lorem555@ipsum.es").into(UIlogin.CMP_email),
						Enter.theValue("incorrecta").into(UIlogin.CMP_pass),
						Click.on(UIlogin.BTN_SubmitLogin)			
				); }
	
	public static Performable paraVolverAIntentar() {
		return Tasks.instrumented(IngresarIncorrectamente.class);
	}
	
}
