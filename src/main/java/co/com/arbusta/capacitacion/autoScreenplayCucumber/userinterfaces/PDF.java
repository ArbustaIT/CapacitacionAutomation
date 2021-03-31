package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class PDF implements Task {

	private PageObject page;

	public PDF(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
			Click.on(UIMicuenta.BTN_FACTURA));
	}
	public static PDF descargar(PageObject page) {
		return Tasks.instrumented(PDF.class,page);

}
	
}
