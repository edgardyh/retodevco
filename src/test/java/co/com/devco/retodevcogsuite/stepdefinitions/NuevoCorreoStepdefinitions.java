package co.com.devco.retodevcogsuite.stepdefinitions;

import co.com.devco.retodevcogsuite.question.factories.Es;
import co.com.devco.retodevcogsuite.task.CrearCorreo;
import co.com.devco.retodevcogsuite.task.factories.Diligencia;
import co.com.devco.retodevcogsuite.userinterface.IngresoCorreoPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class NuevoCorreoStepdefinitions {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("UsuarioGoogle");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("que un usuario esta en la pagina de gmail para crear un nuevo usuario")
    public void queUnUsuarioEstaEnLaPaginaDeGmailParaCrearUnNuevoUsuario() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://gmail.com"));
    }

    @Cuando("el usuario ingresa por la pantalla de crear una cuenta de google y llena todos los campos solicitados y acepta las condiciones")
    public void elUsuarioIngresaPorLaPantallaDeCrearUnaCuentaDeGoogleYLlenaTodosLosCamposSolicitadosYAceptaLasCondiciones() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.seCreaCorreo());
    }

    @Entonces("el deberia visualizar la bandeja de correo")
    public void elDeberiaVisualizarLaBandejaDeCorreo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Es.lblCrearCorreoNumTelefono(IngresoCorreoPage.LBL_VALIDACION_NRO_TELFONO), Matchers.equalTo("El formato de este número de teléfono no se reconoce. Comprueba el país y el número.")));
    }
}
