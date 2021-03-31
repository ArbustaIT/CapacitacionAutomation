package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UICompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class compra implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(                  
						 Click.on(UICompra.BTN_CAJA1),
						 Click.on(UICompra.BTN_CAJA3),
						 Click.on(UICompra.BTN_CHECK),
						 Click.on(UICompra.BTN_CAJA4),
		                 Click.on(UICompra.BTN_METODODEPAGO),
		                 Click.on(UICompra.BTN_CONFIRMACIONDEPAGO));
                         //Scroll.to(UICompra.BTN_CONFIRMACIONDEPAGO));		
	}
		public static  compra completar() {
			return Tasks.instrumented(compra.class);
		}	
   }

