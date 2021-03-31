package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.UILogin;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

public class IniciarSesion implements Task {

	private PageObject page;

	public IniciarSesion(PageObject page) {
		this.page = page;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
				actor.attemptsTo(
				Open.browserOn(page), 
                Click.on(UILogin.BTN_Login),
                Click.on(UILogin.INPUT_email),
                Scroll.to(UILogin.INPUT_email),
			//	System.out.print("Se hizo scroll")
                Enter.theValue("jhorman125@gmail.com").into(UILogin.INPUT_email),
                Click.on(UILogin.INPUT_pass),
                Enter.theValue("Villalva@1993").into(UILogin.INPUT_pass),
                Click.on(UILogin.BTN_SubmitLogin));
}
	public static IniciarSesion diligenciaFormularioEn(PageObject page) {
		return Tasks.instrumented(IniciarSesion.class,page);
	}
}

