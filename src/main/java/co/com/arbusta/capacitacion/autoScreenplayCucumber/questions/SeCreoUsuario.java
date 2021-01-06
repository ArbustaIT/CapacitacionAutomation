package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIregistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class SeCreoUsuario implements Question<Boolean> {

	@Step ("{0} Falla el ingreso")
	public Boolean answeredBy(Actor actor) {
		
		return Text.of(UIregistro.BTN_cerrar_sesion).toString().contains("Sing Out");

	}
	
public static SeCreoUsuario alRegistrarse() {
	return new SeCreoUsuario();
}
}