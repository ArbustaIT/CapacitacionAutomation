package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UImenuCategorias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BannerCategoria implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		 Boolean bool = false;
				
		 if ( UImenuCategorias.BOX_TITULO_DE_SECCION.resolveFor(actor).containsText(UImenuCategorias.DRP_WOMEN.toString()) ) {
			 
			 System.out.println("comparo la seccion con el titulo");
			 bool = true;
		 }
		 
		return bool;
					
	}
	
	public static BannerCategoria correspondeAlIngresado() {
		return new BannerCategoria();
	}


}