package co.com.bancolombia.certificacion.golpredictortest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/golpredictor.feature",
		glue= {"co.com.bancolombia.certificacion.golpredictortest.step_definitions"},
		snippets = SnippetType.CAMELCASE //para escribir el metodo en Camel
		//,tags = {"@Scenario_OK"}
		)

public class GolPredictorRunner {

}
