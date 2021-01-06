package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIlogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class Ingreso implements Question<Boolean> {

	@Step ("{0} Imgresa a la pagina de forma exitosa")
	public Boolean answeredBy(Actor actor) {
		
		//.isEnabled
		return Text.of(UIlogin.BTN_SingOut).viewedBy(actor).asBoolean();
	}
	public static Ingreso Exitoso() {
		return new Ingreso();
	}
	
	
}
