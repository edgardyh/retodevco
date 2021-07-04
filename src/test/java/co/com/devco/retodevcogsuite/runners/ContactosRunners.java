package co.com.devco.retodevcogsuite.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agregar_contactos_google.feature",
        glue = "co/com/devco/retodevcogsuite/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@AgregarContactos")

public class ContactosRunners {
}
