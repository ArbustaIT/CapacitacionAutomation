package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIregistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class marcaErroresEnCampos implements Question<Boolean> {

	@Step ("{0} Falla el ingreso")
	public Boolean answeredBy(Actor actor) {
		
		return Text.of(UIregistro.OBJ_errores_en_campos).toString().contains("errors");

	}
	
public static marcaErroresEnCampos alQuererRegistrarse() {
	return new marcaErroresEnCampos();
}
}

