package co.com.devco.retodevcogsuite.stepdefinitions;

import co.com.devco.retodevcogsuite.exception.ExceptionLabel;
import co.com.devco.retodevcogsuite.model.builders.ContactosBuilder;
import co.com.devco.retodevcogsuite.question.factories.Es;
import co.com.devco.retodevcogsuite.task.factories.Diligencia;
import co.com.devco.retodevcogsuite.userinterface.BandejaDeContactosPage;
import co.com.devco.retodevcogsuite.util.constant.MensajeExceptions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;


public class AgregarContactos {

    @Dado("que un usuario esta en la pagina de contactos de google")
    public void queUnUsuarioEstaEnLaPaginaDeContactosDeGoogle() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://contacts.google.com"));
    }

    @Cuando("el usuario se loguea y agrega un contacto")
    public void elUsuarioSeLogueaYAgregaUnContacto() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.seAgreganContactos());
    }

    @Entonces("el deberia visualizar el contacto agregado")
    public void elDeberiaVisualizarElContactoAgregado() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Es.lblFinalNombreContacto(BandejaDeContactosPage.LBL_FINAL_NOMBRE_CONTACO.of("gabriel Santos")),
                        Matchers.equalTo(ContactosBuilder.con().unDatosContactos().getNombrecontacto1()+" "
                                +ContactosBuilder.con().unDatosContactos().getApecontacto1()))
                        .orComplainWith(ExceptionLabel.class, MensajeExceptions.MENSAJE_PERSONALIZADO)
        );
    }

}
