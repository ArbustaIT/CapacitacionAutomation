package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class maxPrendas implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		Boolean bool = false;
		
		if ( UIprendas.POPUP_COMPARE_ADV.resolveFor(actor).isEnabled()) {
			
			System.out.println("despliega advertencia de maximas prendas seleccionadas");
			bool = true;			
		}		
	return bool;
	}
	
	public static maxPrendas advierte() {
		return new maxPrendas();
	}
}