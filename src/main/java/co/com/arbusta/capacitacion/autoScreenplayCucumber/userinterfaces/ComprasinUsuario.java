package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ComprasinUsuario  {

    public static final Target BTN_CAJA1 = Target.the("Botón CAJA1 ").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
    public static final Target BTN_LOGIN = Target.the("Botón CAJA1 ").located(By.xpath("//*[@id=\"email\"]"));

}
