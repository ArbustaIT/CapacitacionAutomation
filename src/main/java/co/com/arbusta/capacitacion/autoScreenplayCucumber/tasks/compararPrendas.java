package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.pages.PageObject;

public class compararPrendas implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}
	
	public static IrA AutomationPractice(PageObject page) {
		return Tasks.instrumented(IrA.class, page);
	}

}


