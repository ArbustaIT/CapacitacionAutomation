package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIlogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Signout implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		//return UIlogin.BTN_SingOut.resolveFor(actor).containsOnlyText("Pax");
		//	return UIlogin.BTN_SingOut.resolveAllFor(actor).contains("pax");
				
		 String texto = UIlogin.BTN_SingOut.resolveFor(actor).getText().toString();		 
	
		 return texto.contains("pax");
	}
	
	public static Signout estaPresente() {
		return new Signout();
	}



}