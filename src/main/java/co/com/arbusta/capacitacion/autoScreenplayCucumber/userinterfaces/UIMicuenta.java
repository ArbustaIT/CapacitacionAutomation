package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class UIMicuenta {
    public static final Target BTN_CUENTA = Target.the("Botón Mi cuentas").located(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]"));
	public static final Target BTN_HISTORIALCOMPRA = Target.the("Botón de historial de compra").located(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a"));
	public static final Target BTN_FACTURA = Target.the("Botón de factura de compra").located(By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[6]/a"));
	public static final Target BTN_DETALLES = Target.the("Botón detalles de compra").located(By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[7]/a[1]"));
	public static final Target BTN_REORDENAR = Target.the("Botón de reordenar compra").located(By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[7]/a[2]"));

	
}
