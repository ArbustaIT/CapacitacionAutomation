package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIbarraDeBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class producto implements Task  {

	private String producto;

	public producto(String producto) {
		this.producto = producto;
	}
	
	@Step("{0} login para loguearse")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(producto).into(UIbarraDeBusqueda.CMP_Barra_Busqueda),
				Click.on(UIbarraDeBusqueda.BTN_Barra_Busqueda)			
		); }
	
	public static producto busca(String producto) {
		return Tasks.instrumented(producto.class,producto);
	}
}