package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class comparadorDePrendas implements Question<Boolean> {

	@Step ("{0} Falla el ingreso")
	public Boolean answeredBy(Actor actor) {
		
		//Precondicion: la pagina debe estar en el idioma original (ingles).
		
		return Text.of(UIprendas.TITULO_COMPARACIONES).toString().contains("Product Comparison");

	}
	public static comparadorDePrendas redireccionaA() {
		return new comparadorDePrendas();
	}
		
}