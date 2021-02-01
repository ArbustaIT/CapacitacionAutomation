package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIlogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class boxPasswdError implements Question<Boolean> {
	
	@Override
	public Boolean answeredBy(Actor actor) {
				
//		if (UIlogin.BOX_passwdInvalid.resolveFor(actor).isEnabled()) {
//			
//			 System.out.println("encontré el elemento");
//			 return false;
//					 
//		}
//		return false;
		
		return UIlogin.BOX_passwdInvalid.resolveFor(actor).isEnabled();
	}

	public static boxPasswdError estaPresente() {
		return new boxPasswdError();
	}
}
