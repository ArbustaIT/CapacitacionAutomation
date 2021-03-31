package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

//import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class UIArticulo {

	public static final Target DRP_Women = Target.the("Desplegable a seccion Mujer").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	public static final Target BTN_TOPS = Target.the("Btn Tops").located(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
	public static final Target BTN_MINIATURA = Target.the("Boton miniatura").located(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
	public static final Target BTN_AÑADIR = Target.the("Boton añadir").located(By.xpath("//*[@id=\"add_to_cart\"]"));
	public static final Target BTN_CAJA = Target.the("Boton Caja").located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
    
	
}  
