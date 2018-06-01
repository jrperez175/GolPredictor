package co.com.bancolombia.certificacion.golpredictortest.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class GolPredictorLogin  {
	
	public static final Target  TEXT_USERNAME = Target.the("Text Username").located(By.id("Header1_UserInfo1_LoginView1_login1_UserName"));
	public static final Target  TEXT_PASSWORD = Target.the("Text Password").located(By.id("Header1_UserInfo1_LoginView1_login1_Password"));
	public static final Target  BUTTON_LOGIN = Target.the("Button Login").located(By.id("Header1_UserInfo1_LoginView1_login1_LoginButton"));
	

}
