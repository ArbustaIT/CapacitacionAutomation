package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class UICompra  {

    public static final Target BTN_CAJA1 = Target.the("Botón CAJA1 ").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	
	public static final Target BTN_CAJA3 = Target.the("Botón CAJA3").located(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
    
	public static final Target BTN_CHECK = Target.the("Botón CHECK").located(By.xpath("//*[@id=\"uniform-cgv\"]"));

	public static final Target BTN_CAJA4 = Target.the("Botón CAJA4").located(By.xpath("//*[@id=\"form\"]/p/button/span"));
	
	public static final Target BTN_METODODEPAGO = Target.the("BOTÓN METODODEPAGO").located(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));

	public static final Target BTN_CONFIRMACIONDEPAGO = Target.the("BOTÓN CONFIRMACIONDEPAGO").located(By.xpath("//*[@id=\"cart_navigation\"]/button"));
}
