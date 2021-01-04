package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.loginUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class SeMuestra implements Question<Boolean> {

	@Step ("{0} Ingresa a la pagina de forma exitosa")
	public Boolean answeredBy(Actor actor) {
		
		//compara el contenido dentro del objeto con el contenido del string. 
		//No usa actor, si la pagina se traduce falla, no se si funciona, funciona solo con el email dicho.
		
		return Text.of(loginUserInterfaces.OBJ_cartel_error_pass).toString()
				.contains("A confirmation email has been sent to your address: lorem555@ipsum.es");

		
	}
	public static SeMuestra verificacionDeEmailEnviado() {
		return new SeMuestra();
	}
		
}