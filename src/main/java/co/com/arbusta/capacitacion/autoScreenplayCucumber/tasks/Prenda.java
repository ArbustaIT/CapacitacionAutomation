package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIArticulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
//import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Scroll;

public class Prenda implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
	 	actor.attemptsTo(
	                     Click.on(UIArticulo.DRP_Women),
	                     Click.on(UIArticulo.BTN_TOPS),
	                     Scroll.to(UIArticulo.BTN_MINIATURA),
	                     Click.on(UIArticulo.BTN_MINIATURA), 
	                     Click.on(UIArticulo.BTN_AÑADIR),
	 	                 Click.on(UIArticulo.BTN_CAJA));
	 	                 
	}
	public static  Prenda añadir() {
		return Tasks.instrumented(Prenda.class);
	}	
}
