package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class loginUserInterfaces {
	
	public static final Target BTN_SingIn = Target.the("Boton de login").located(By.xpath("//*[@id=\\\"header\\\"]/div[2]/div/div/nav/div[1]/a"));

	public static final Target CMP_email = Target.the("Campo de email").located(By.xpath("//*[@id=\\\"email\\\"]"));
	
	public static final Target CMP_pass = Target.the("Campo de contraseña").located(By.xpath("//*[@id=\\\"passwd\\\"]"));

	public static final Target BTN_SubmitLogin = Target.the("Boton para finalizar logueo").located(By.xpath("//*[@id=\\\"SubmitLogin\\\"]/span"));

	public static final Target OBJ_cartel_error_pass = Target.the("Cartel de error por contraseña invalida").located(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));

	public static final Target BTN_olvide_la_pass = Target.the("Boton olvide mi contraseña").located(By.xpath("//*[@id=\\\"login_form\\\"]/div/p[1]/a"));

	public static final Target BTN_forgot_pass = Target.the("Confirmacion de envio de email para nueva contraseña").located(By.xpath("//*[@id=\\\"form_forgotpassword\\\"]/fieldset/p/button"));

	public static final Target OBJ_cartel_email_recupero = Target.the("Cartel de email de recupero enviado").located(By.xpath("//*[@id=\"center_column\"]/div/p"));

	public static final Target BTN_SingOut = Target.the("Boton de Cerrar Sesion").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));

}

