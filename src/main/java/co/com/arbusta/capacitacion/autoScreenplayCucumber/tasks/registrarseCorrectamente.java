package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIlogin;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UIregistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class registrarseCorrectamente implements Task {

	public registrarseCorrectamente () {
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				//antes del registro
				
				Click.on(UIregistro.BTN_SingIn),
				Enter.theValue("lorem555@ipsum.es").into(UIregistro.CMP_email),
				Click.on(UIregistro.BTN_Crea_una_cuenta),
				
				//registro
				
				Click.on(UIregistro.BTN_Genero_hombre),
				Enter.theValue("Levadura").into(UIregistro.CMP_nombre),
				Enter.theValue("Salvado").into(UIregistro.CMP_apellido),
				Enter.theValue("12345").into(UIregistro.CMP_passwd),
				Click.on(UIregistro.DRP_dias),
				Click.on(UIregistro.DRP_dia_4),				
				Click.on(UIregistro.DRP_meses),
				Click.on(UIregistro.DRP_junio),
				Click.on(UIregistro.DRP_anios),
				Click.on(UIregistro.DRP_1996),
				Enter.theValue("Levadura").into(UIregistro.CMP_nombre2),
				Enter.theValue("Salvado").into(UIregistro.CMP_apellido2),
				Enter.theValue("calle 888 numero 2750").into(UIregistro.CMP_direccion),
				Enter.theValue("Narmia").into(UIregistro.CMP_ciudad),
				Enter.theValue("15302").into(UIregistro.CMP_codigo_postal),
				Enter.theValue("1167321720").into(UIregistro.CMP_movil),
				Click.on(UIregistro.DRP_estado),
				Click.on(UIregistro.DRP_Alabama),
				Click.on(UIregistro.BTN_registarse)			
		
		);
	} 

	public static registrarseCorrectamente paraRegistrarse() {
		return Tasks.instrumented(registrarseCorrectamente.class);
	}	
	
}