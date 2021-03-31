package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.ComprasinUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class CompraFallida implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(                  
						 Click.on(ComprasinUsuario.BTN_CAJA1),
		                 Scroll.to(ComprasinUsuario.BTN_LOGIN));
		
		               
	}
	    public static  CompraFallida SinUsuario() {
		return Tasks.instrumented(CompraFallida.class);
		}	
   }
