package co.com.bancolombia.certificacion.golpredictortest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.golpredictortest.model.DataLogin;
import co.com.bancolombia.certificacion.golpredictortest.user_interface.GolPredictorLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterData implements Task {
	
	private DataLogin datalogin;
	
	public EnterData(DataLogin datalogin) {
		this.datalogin = datalogin;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(datalogin.getUser()).into(GolPredictorLogin.TEXT_USERNAME));
		actor.attemptsTo(Enter.theValue(datalogin.getPassword()).into(GolPredictorLogin.TEXT_PASSWORD));
		actor.attemptsTo(Click.on(GolPredictorLogin.BUTTON_LOGIN));
	}
	
	public static EnterData the(DataLogin datalogin) {
		return instrumented(EnterData.class, datalogin);
	}

	
}
