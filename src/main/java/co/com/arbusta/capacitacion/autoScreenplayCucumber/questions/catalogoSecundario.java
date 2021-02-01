package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIcatalogoSecundario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class catalogoSecundario implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		Boolean focusPopular = false;
		
		if (UIcatalogoSecundario.BTN_POPULAR.resolveFor(actor).hasFocus()) {
			
			System.out.println("estoy sobre popular");
			focusPopular = true;
		}
		return focusPopular;
		
	}
	
	public static catalogoSecundario vuelveApupolar() {
		return new catalogoSecundario();
	}
}