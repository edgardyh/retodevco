package co.com.devco.retodevcogsuite.stepdefinitions;


import co.com.devco.retodevcogsuite.model.builders.ContactosBuilder;
import co.com.devco.retodevcogsuite.task.factories.Diligencia;
import co.com.devco.retodevcogsuite.userinterface.BandejaDeContactosPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;


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
        OnStage.withCurrentActor(Ensure.that(BandejaDeContactosPage.LBL_FINAL_CINCO).text()
                .contains(ContactosBuilder.con().unDatosContactos().getNombrecontacto1()
                        +" "+ContactosBuilder.con().unDatosContactos().getApecontacto1()));
    }

}
