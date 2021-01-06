package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIprendas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class advertenciaCuartaPrenda implements Question<Boolean> {

	@Step ("{0} Falla el ingreso")
	public Boolean answeredBy(Actor actor) {
		
		return Text.of(UIprendas.POPUP_COMPARE_ADV).toString().contains("You cannot add more than 3 product(s) to the product comparison");

	}
	public static advertenciaCuartaPrenda seMuestra() {
		return new advertenciaCuartaPrenda();
	}
		
}

