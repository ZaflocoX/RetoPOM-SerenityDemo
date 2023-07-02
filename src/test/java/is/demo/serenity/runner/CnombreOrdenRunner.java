package is.demo.serenity.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/CnombreOrden.feature",
        glue = "is.demo.serenity.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CnombreOrdenRunner {
}
