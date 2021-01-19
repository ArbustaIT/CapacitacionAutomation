package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UImenuCategorias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class bannerSub implements Question<Boolean>{

	@Step ("{0} Falla el ingreso")
	public Boolean answeredBy(Actor actor) {
				
		return Text.of(UImenuCategorias.Banner).toString().contains("Casual Dresses");

	}
	public static bannerSub tiene_el_mismo_nombre_que_la_subcategoria() {
		return new bannerSub();
	}
		
}