package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.categoryAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;


public class Validar implements Question<Boolean>{
	
	@Step ("{0} validar pagina de comparacion")
	public Boolean answeredBy(Actor actor) {
		
		return Text.of(categoryAutomationPractice.TITULO_COMPARACIONES).viewedBy(actor).asBoolean();
	}
	public static Validar significadoPalabra() {
		return new Validar();
	}
	
	
}
