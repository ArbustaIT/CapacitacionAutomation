package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class advertenciaUnaPrenda  implements Question<Boolean> {

	@Step ("{0} Falla el ingreso")
	public Boolean answeredBy(Actor actor) {
		
		//Status:no se puede tomar el localizador correspondiente ya que el caso a implementar es fallido. 
		//Objetivo: da fallido siempre.
		
		return false;

	}
	public static advertenciaUnaPrenda seMuestra() {
		return new advertenciaUnaPrenda();
	}
		
}
