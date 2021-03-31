package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class IngresarA implements Task{

	private PageObject pageAP;

	public IngresarA(PageObject page) {
		this.pageAP = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pageAP)); 
	}

	public static IngresarA automationPractice(PageObject page) {
		return Tasks.instrumented(IngresarA.class, page);
	}
}
