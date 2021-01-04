package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class registroUserInterfaces {

	public static final Target BTN_SingIn = Target.the("Boton de login").located(By.xpath("x"));
	
}
