package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UImenuCategorias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BannerSubCategoria implements Question<Boolean>{
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		 Boolean bool = false;
				
		 if ( UImenuCategorias.DRP_BLOUSES.resolveFor(actor).containsText(UImenuCategorias.DRP_BLOUSES.toString()) ) {
			 
			 System.out.println("comparo la seccion con el titulo");
			 bool = true;
		 }
		 
		return bool;
					
	}
	
	public static BannerCategoria correspondeAlIngresado() {
		return new BannerCategoria();
	}


}