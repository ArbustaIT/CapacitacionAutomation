package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Ofertas {

	public static final Target BTN_BANNER1 = Target.the("Botón banner de oferta").located(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a"));
	public static final Target BTN_BANNER2 = Target.the("Botón banner de oferta").located(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[2]/a"));
	public static final Target BTN_MINIATURA3 = Target.the("Botón miniatura de oferta").located(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a"));
	public static final Target BTN_MINIATURA4 = Target.the("Botón miniatura de oferta").located(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/h5/a"));
	

}
