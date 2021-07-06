package co.com.devco.retodevcogsuite.stepdefinitions;

import co.com.devco.retodevcogsuite.question.factories.Es;
import co.com.devco.retodevcogsuite.task.factories.Diligencia;
import co.com.devco.retodevcogsuite.userinterface.BandejaDeCorreoPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class AgregarEventoCalendarioStepdefinitions {

    @Dado("que un usuario inicia sesion por GoogleCalendar")
    public void queUnUsuarioIniciaSesionPorGoogleCalendar() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://calendar.google.com/"));
    }

    @Cuando("el usuario se loguea y crea una reunion en el calendario")
    public void elUsuarioSeLogueaYCreaUnaReunionEnElCalendarioo() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.seCreaEventoCalendario());
    }

    @Entonces("el evento no deberia guardarse porque tiene fecha fin no posterior a la fecha de inicio")
    public void elEventoNoDeberiaGuardarsePorqueTieneFechaFinNoPosteriorALaFechaDeInicio() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Es.lblFinalNombreDeEvento(BandejaDeCorreoPage.INP_FINAL_EDITAR_EVENTO),
                        Matchers.isEmptyOrNullString())
        );
    }

}
