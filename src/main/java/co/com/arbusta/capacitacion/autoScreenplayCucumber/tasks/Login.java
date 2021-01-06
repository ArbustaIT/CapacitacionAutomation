package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIlogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task  {

	public Login () {
		
	}

	@Step("{0} login para loguearse")
	public <T extends Actor> void performAs(T actor) {

		//se ponen las tareas normales.
		actor.attemptsTo(
				
						Click.on(UIlogin.BTN_SingIn),
						Enter.theValue("lorem555@ipsum.es").into(UIlogin.CMP_email),
						Enter.theValue("12345678").into(UIlogin.CMP_pass),
						Click.on(UIlogin.BTN_SubmitLogin)			
				); }
	
	//llama a la clase para que se ejecute, onda con forma de tarea asi sigue el formato. Es como la imagen de la task.
	public static Login paraLoguearse() {
		return Tasks.instrumented(Login.class);
	}
	
}