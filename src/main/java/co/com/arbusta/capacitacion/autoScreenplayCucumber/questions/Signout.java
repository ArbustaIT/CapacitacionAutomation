package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UILogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Signout implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
				
		 String texto = UILogin.BTN_SingOut.resolveFor(actor).getText().toString();		 
	
		 return texto.contains("pax");
	}
	
	public static Signout estaPresente() {
		return new Signout();
	}



}