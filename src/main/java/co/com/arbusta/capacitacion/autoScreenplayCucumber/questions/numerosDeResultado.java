package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIbarraDeBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class numerosDeResultado implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
			Boolean hayPrendas = false;
			
			if ( UIbarraDeBusqueda.OBJ_msj_resultados_busqueda.resolveFor(actor).isEnabled()) {
				hayPrendas = true;
			}
		return hayPrendas;
	}
	
	public static numerosDeResultado devuelveUn() {
		return new numerosDeResultado();
	}
}