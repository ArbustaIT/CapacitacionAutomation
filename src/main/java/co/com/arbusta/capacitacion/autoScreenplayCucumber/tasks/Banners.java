package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.Ofertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

public class Banners implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
	actor.attemptsTo(  Click.on(Ofertas.BTN_BANNER1));
	SerenityWebdriverManager.inThisTestThread().getCurrentDriver().navigate().to("http://automationpractice.com/index.php");
	actor.attemptsTo(Click.on(Ofertas.BTN_BANNER2));
	SerenityWebdriverManager.inThisTestThread().getCurrentDriver().navigate().to("http://automationpractice.com/index.php");
	actor.attemptsTo(Click.on(Ofertas.BTN_MINIATURA3));
	SerenityWebdriverManager.inThisTestThread().getCurrentDriver().navigate().to("http://automationpractice.com/index.php");
	actor.attemptsTo(Click.on(Ofertas.BTN_MINIATURA4));   
	
	 
	
	}
	public static  Banners visualizar() {
		return Tasks.instrumented(Banners.class);
		
	}

}
