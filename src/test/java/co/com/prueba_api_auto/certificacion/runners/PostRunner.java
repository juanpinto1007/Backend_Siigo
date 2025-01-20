package co.com.prueba_api_auto.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/creacion_usuario.feature",
        glue = "co/com/prueba_api_auto/certificacion/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)



public class PostRunner {
}
