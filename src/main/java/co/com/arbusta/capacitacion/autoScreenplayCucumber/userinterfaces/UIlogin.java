package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class UILogin extends PageObject{
	
	// flujo de login
	
	public static final Target BTN_SingIn = Target.the("Boton de login").located(By.className("login"));	
	public static final Target BOX_sectorAuthentication = Target.the("sector de autenticacion").located(By.id("center_column"));
	public static final Target CMP_email = Target.the("Campo de email").located(By.id("email"));
	public static final Target CMP_passwd = Target.the("Campo de contraseña").located(By.id("passwd"));
	public static final Target BTN_SubmitLogin = Target.the("Boton para finalizar logueo").located(By.id("SubmitLogin"));
	public static final Target BOX_sectorLogin = Target.the("sector de login").located(By.id("login_form"));
	
	// flujo de recupero
	
	public static final Target BTN_olvide_la_pass = Target.the("Boton olvide mi contraseña").located(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
	public static final Target BOX_sectorRecupero = Target.the("sector de recupero").located(By.className("box"));
	public static final Target BTN_forgot_pass = Target.the("Confirmacion de envio de email para nueva contraseña").located(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button"));

	//Validaciones
	
	public static final Target BTN_SingOut = Target.the("Boton de Cerrar Sesion").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	public static final Target BOX_passwdInvalid = Target.the("Cartel de error por contraseña invalida").located(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
	public static final Target BOX_confirmacionEmail = Target.the("Cartel de email de recupero enviado").located(By.xpath("//*[@id=\"center_column\"]/div/p"));

	//Iniciar sesion
	
    public static final Target BTN_Login = Target.the("Botón login").located(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]"));
    public static final Target INPUT_email = Target.the("Input email").located(By.xpath("//input[@id='email']"));
    public static final Target INPUT_pass  = Target.the("Input contraseña").located(By.xpath("//*[@id=\"passwd\"]"));
}

