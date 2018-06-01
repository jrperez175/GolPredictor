package co.com.bancolombia.certificacion.golpredictortest.user_interface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.golpredictor.com")
public class GolPredictorHomePage extends PageObject{
	public static final Target GolPredictor_LOGO = Target.the("GolPredictor Home Logo").located(By.id("logo"));

}
