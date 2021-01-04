package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;



import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.loginUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class HuboError implements Question<Boolean> {

	@Step ("{0} Falla el ingreso")
	public Boolean answeredBy(Actor actor) {
		
		//Intencion: retorna el booleano correspondiente a comparar el contenido del contenedor con el string.
		return Text.of(loginUserInterfaces.OBJ_cartel_error_pass).toString().contains("Authentication failed.");

	}
	public static HuboError ParaEntrar() {
		return new HuboError();
	}
		
}