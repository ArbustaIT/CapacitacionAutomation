package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php?id_category=3&controller=category")
public class UIprendas extends PageObject {

	public UIprendas () {
		
	}
	
	//Para las Tasks
	
	public static final Target WOMEN = Target.the("Boton a seccion Mujer").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	
	public static final Target PRIMER_PRENDA = Target.the("Primer Prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a"));
	
	public static final Target SEGUNDA_PRENDA = Target.the("Segunda Prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a"));
	
	public static final Target TERCER_PRENDA = Target.the("Tercer Prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[3]/div[2]/a"));
	
	public static final Target CUARTA_PRENDA = Target.the("Cuarta Prenda").located(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[3]/div[2]/a"));

	public static final Target BTN_COMPARE = Target.the("Boton Comparar").located(By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/form/button"));	
	
	//Para las Questions
	
	public static final Target TITULO_COMPARACIONES = Target.the("Titulo de la seccion de comparacion").located(By.xpath("//*[@id=\"center_column\"]/h1"));	

	public static final Target POPUP_COMPARE_ADV = Target.the("Titulo de la seccion de comparacion").located(By.xpath("//*[@id=\"category\"]/div[2]/div/div/div/div/p"));	

}

