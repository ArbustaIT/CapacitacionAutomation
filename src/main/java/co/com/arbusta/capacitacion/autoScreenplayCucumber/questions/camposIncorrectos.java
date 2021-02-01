package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIregistro;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class camposIncorrectos implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
	WebElementFacade localizador = UIregistro.BOX_errores_en_campos.resolveFor(actor);
	
	if ( localizador.isEnabled() ) {
		
		System.out.println("encontré el elemento");
		return false;	
		}

	return false;
	}
	
	public static camposIncorrectos muestra() {
		return new camposIncorrectos();
	}

}

