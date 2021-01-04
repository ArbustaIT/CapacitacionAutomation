package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


/**@author Carolina Muñoz
 * Paquete userinterfaces
 * En esta clase Declaramos las variables Target, las cuales son objetos de la pagina
 * los objetos son propiedades de la pagina
 * esas propiedades son localizadas o mapeadas para realizar las acciones en ellas en la automatizacion.
 * 
 * */
@DefaultUrl("https://www.wikipedia.org/")
public class HomeWikiPage extends PageObject {

	public HomeWikiPage() {
		
	}
public static final Target INPUT_TEXT_BUSCAR = Target.the("Input Text Buscar").located(By.name("search"));

	/** Variable Target
	 * 1. public: Las variables deben ser publicas para poder acceder a ellas atraves de otras clases
	 * 2. static: deben ser estaticas para acceder a esta atraves de la misma clase.
	 * 3. final:  porque el valor es contante osea que no cambia con el tiempo.* 
	 * 4. Target: una clase abstracta de Screenplay
	 * 5. Nombre de Target: el nombre de la variable Target debe ser en mayuscula,
	 * y haciendo refererencia a la tiqueta html dentro de la página.
	 * 6.por ultimo indicamos la ruta del localizador del elemento. 
	 * */
}
