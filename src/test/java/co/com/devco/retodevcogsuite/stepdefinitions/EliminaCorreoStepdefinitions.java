package co.com.devco.retodevcogsuite.stepdefinitions;
import co.com.devco.retodevcogsuite.exception.ExceptionLabel;
import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;
import co.com.devco.retodevcogsuite.question.factories.Es;
import co.com.devco.retodevcogsuite.task.factories.Diligencia;
import co.com.devco.retodevcogsuite.userinterface.BandejaDeCorreoPage;
import co.com.devco.retodevcogsuite.util.constant.MensajeExceptions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class EliminaCorreoStepdefinitions {

    @Cuando("el usuario se loguea y elimina correos enviados y en papelera definitivamente")
    public void elUsuarioSeLogueaYEliminaCorreosEnviadosYEnPapeleraDefinitivamente() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.seEliminaCorreo());
    }

    @Entonces("el deberia visualizar la papelera vacia")
    public void elDeberiaVisualizarLaPapeleraVacia() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Es.lblFinalPapeleraVacia(BandejaDeCorreoPage.LBL_FINAL_PAPELERA_LIMPIA),
                        Matchers.equalTo(DatosBuilder.con().unDatosCorreo().getPapeleralimpia()))
                        .orComplainWith(ExceptionLabel.class, MensajeExceptions.NO_HAY_LBL_DE_PAPELERA_VACIA)
        );
    }
}
