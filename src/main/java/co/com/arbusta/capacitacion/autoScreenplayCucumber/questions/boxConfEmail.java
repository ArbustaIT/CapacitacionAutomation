package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UILogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class boxConfEmail implements Question<Boolean>{

	public boxConfEmail () {}
	
	@Override
	public Boolean answeredBy(Actor actor) {
			
		return UILogin.BOX_confirmacionEmail.resolveFor(actor).isEnabled();
					
	}
	
	public static boxConfEmail estaPresente() {
		return new boxConfEmail();
	}


}
