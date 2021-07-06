package co.com.devco.retodevcogsuite.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/nuevo_correo_google.feature",
        glue = "co/com/devco/retodevcogsuite/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "")


public class NuevoCorreoRunners {
}
