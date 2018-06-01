package co.com.bancolombia.certificacion.golpredictortest.step_definitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.golpredictortest.model.DataLogin;
import co.com.bancolombia.certificacion.golpredictortest.tasks.EnterData;
import co.com.bancolombia.certificacion.golpredictortest.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.golpredictortest.user_interface.GolPredictorHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GolPredictorStepDefinitios {
	@Managed(driver="chrome")
	private WebDriver hisDriver;
	private Actor Jhon = Actor.named("Jhon");
	private GolPredictorHomePage golpredictorHomePage;
	
	@Before
	public void setup() {
		Jhon.can(BrowseTheWeb.with(hisDriver));
	}
	
	@Given ("^that (.*) opens his browser at (.*)$")
	public void thatTheUserOpensHisBrowserAt(String Name, String webpage) {
		Jhon.wasAbleTo(OpenTheBrowser.at(golpredictorHomePage));
	}
	
	@When ("^he enter your data (.*) (.*)$")
	public void theUserEnterHisData(String user, String password ) {
		Jhon.attemptsTo(EnterData.the(new DataLogin(user,password)));
		
	}
	
	@Then("^he would see your bet$")
	public void heWouldSeeYourBet()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	

}
