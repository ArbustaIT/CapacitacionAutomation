package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.loginUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class registrarse implements Task {

	public registrarse () {
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				Click.on(loginUserInterfaces.BTN_SingIn),
				Enter.theValue("lorem555@ipsum.es").into(loginUserInterfaces.CMP_email),
				Enter.theValue("incorrecta").into(loginUserInterfaces.CMP_pass),
				Click.on(loginUserInterfaces.BTN_SubmitLogin)			
		);
	} 

	public static Performable registrarse correctamente() {
		return Tasks.instrumented(registrarse.class);
	}
	
	public static Performable registrarse incorrectamente () {
		return Tasks.instrumented(registrarse.class);
	}
	
}
