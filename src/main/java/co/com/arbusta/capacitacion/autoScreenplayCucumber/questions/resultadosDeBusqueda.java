package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIbarraDeBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class resultadosDeBusqueda implements Question<Boolean> {

	@Step ("{0} Falla el ingreso")
	public Boolean answeredBy(Actor actor) {
		
		return Text.of(UIbarraDeBusqueda.OBJ_msj_resultados_busqueda).toString().contains("results have been found.");

	}
	
public static resultadosDeBusqueda seVisualiza() {
	return new resultadosDeBusqueda();
	}
}