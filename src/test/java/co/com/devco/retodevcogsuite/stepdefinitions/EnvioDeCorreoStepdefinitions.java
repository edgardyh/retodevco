package co.com.devco.retodevcogsuite.stepdefinitions;

import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;
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

public class EnvioDeCorreoStepdefinitions {

    @Dado("que un usuario esta en la pagina para iniciar sesion")
    public void queUnUsuarioEstaEnLaPaginaParaIniciarSesion() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://gmail.com"));
    }

    @Cuando("el usuario se loguea y envia correos llenando los campos para - asunto - descripcion")
    public void elUsuarioSeLogueaYEnviaCorreosLlenandoLosCamposParaAsuntoDescripcion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.seEnviaCorreo());
    }

    @Entonces("el deberia visualizar los correos enviados en la pestaña de enviados")
    public void elDeberiaVisualizarLosCorreosEnviadosEnLaPestañaDeEnviados() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Es.lblCorreosEnviados(BandejaDeCorreoPage.LBL_FINAL_ASUNTO),
                        Matchers.equalTo(DatosBuilder.con().unDatosCorreo().getAsunto3()))
        );
    }

}
