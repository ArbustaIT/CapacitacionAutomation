package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIMicuenta;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Micuenta implements Task {

	
	private PageObject page;

	public Micuenta(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
			Open.browserOn(page),
			Click.on(UIMicuenta.BTN_CUENTA),
		    Click.on(UIMicuenta.BTN_HISTORIALCOMPRA));
		    
		
	}
	public static Micuenta opciodemiCuenta(PageObject page) {
		return Tasks.instrumented(Micuenta.class,page);

}
}
