package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class registroUserInterfaces {

	public static final Target BTN_SingIn = Target.the("Boton de login").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	public static final Target CMP_email = Target.the("Boton de login").located(By.xpath("//*[@id=\"email_create\"]"));
	public static final Target BTN_Crea_una_cuenta = Target.the("Boton de login").located(By.xpath("//*[@id=\"SubmitCreate\"]"));

	//registro
	
	public static final Target BTN_Genero_hombre = Target.the("Boton de login").located(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]/label"));
	public static final Target CMP_nombre = Target.the("Boton de login").located(By.xpath("//*[@id=\"customer_firstname\"]"));
	public static final Target CMP_apellido = Target.the("Boton de login").located(By.xpath("//*[@id=\"customer_lastname\"]"));
	public static final Target CMP_passwd = Target.the("Boton de login").located(By.xpath("//*[@id=\"passwd\"]"));
	public static final Target DRP_dias = Target.the("Boton de login").located(By.xpath("//*[@id=\"days\"]"));
	public static final Target DRP_dia_4 = Target.the("Boton de login").located(By.xpath("//*[@id=\"days\"]/option[5]"));
	public static final Target DRP_meses = Target.the("Boton de login").located(By.xpath("//*[@id=\"months\"]"));
	public static final Target DRP_junio = Target.the("Boton de login").located(By.xpath("//*[@id=\"months\"]/option[7]"));
	public static final Target DRP_anios = Target.the("Boton de login").located(By.xpath("//*[@id=\"years\"]"));
	public static final Target DRP_1996 = Target.the("Boton de login").located(By.xpath("//*[@id=\"years\"]/option[27]"));
	public static final Target CMP_nombre2 = Target.the("Boton de login").located(By.xpath("//*[@id=\"firstname\"]"));
	public static final Target CMP_apellido2 = Target.the("Boton de login").located(By.xpath("//*[@id=\"lastname\"]"));
	public static final Target CMP_direccion = Target.the("Boton de login").located(By.xpath("//*[@id=\"address1\"]"));
	public static final Target CMP_ciudad = Target.the("Boton de login").located(By.xpath("//*[@id=\"city\"]"));
	public static final Target CMP_codigo_postal = Target.the("Boton de login").located(By.xpath("//*[@id=\"postcode\"]"));
	public static final Target DRP_estado = Target.the("Boton de login").located(By.xpath("//*[@id=\"id_state\"]"));
	public static final Target DRP_Alabama = Target.the("Boton de login").located(By.xpath("//*[@id=\"id_state\"]/option[2]/font/font"));
	public static final Target CMP_movil = Target.the("Boton de login").located(By.xpath("//*[@id=\"phone_mobile\"]"));

	public static final Target BTN_registarse = Target.the("Boton de login").located(By.xpath("//*[@id=\"submitAccount\"]"));

	public static final Target CMP_pacsswd = Target.the("Boton de login").located(By.xpath("//*[@id=\"passwd\"]"));

}
