package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.registroUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class registrarseIncorrectamente implements Task {
	
	public registrarseIncorrectamente () {
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				
				//antes del registro
				
				Click.on(registroUserInterfaces.BTN_SingIn),
				Enter.theValue("lorem555@ipsum.es").into(registroUserInterfaces.CMP_email),
				Click.on(registroUserInterfaces.BTN_Crea_una_cuenta),
				
				//registro
				
				Click.on(registroUserInterfaces.BTN_Genero_hombre),
				Enter.theValue("Levadura").into(registroUserInterfaces.CMP_nombre),
				Enter.theValue("Salvado").into(registroUserInterfaces.CMP_apellido),
				Enter.theValue("1235").into(registroUserInterfaces.CMP_passwd),
				Click.on(registroUserInterfaces.DRP_dias),
				Click.on(registroUserInterfaces.DRP_dia_4),				
				Click.on(registroUserInterfaces.DRP_meses),
				Click.on(registroUserInterfaces.DRP_junio),
				Click.on(registroUserInterfaces.DRP_anios),
				Click.on(registroUserInterfaces.DRP_1996),
				Enter.theValue("Levadura").into(registroUserInterfaces.CMP_nombre2),
				Enter.theValue("Salvado").into(registroUserInterfaces.CMP_apellido2),
				Enter.theValue("calle 888 numero 2750").into(registroUserInterfaces.CMP_direccion),
				Enter.theValue("Narmia").into(registroUserInterfaces.CMP_ciudad),
				Enter.theValue("1302").into(registroUserInterfaces.CMP_codigo_postal),
				Enter.theValue("").into(registroUserInterfaces.CMP_movil),
				Click.on(registroUserInterfaces.DRP_estado),
				Click.on(registroUserInterfaces.DRP_Alabama),
				Click.on(registroUserInterfaces.BTN_registarse)			
		
		);

	} 
	
	public static registrarseIncorrectamente paraRebotar() {
		return Tasks.instrumented(registrarseIncorrectamente.class);
	}


}
