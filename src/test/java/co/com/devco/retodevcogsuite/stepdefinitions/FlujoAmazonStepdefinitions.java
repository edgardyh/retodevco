package co.com.devco.retodevcogsuite.stepdefinitions;

import co.com.devco.retodevcogsuite.question.factories.Es;
import co.com.devco.retodevcogsuite.task.factories.Diligencia;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class FlujoAmazonStepdefinitions {

    @Dado("que un usuario esta en la pagina para de Amazon")
    public void queUnUsuarioEstaEnLaPaginaParaDeAmazon() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.amazon.com"));
    }

    @Cuando("el usuario escoge un producto y lo agrega al carrito")
    public void elUsuarioEscogeUnoOVariosProductosYLlenaCamposSolicitados() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.seAgregaUnProducto());
    }

    @Entonces("el deberia visualizar el producto agreado en su carrito")
    public void elDeberiaVisualizarElProductoAgregadoEnSuCarrito() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Es.lblVisibleProducto(),Matchers.equalTo(true)));
    }

    @Cuando("el usuario escoge varios productos y los agrega al carrito")
    public void elUsuarioEscogeVariosProductosYLosAgregaAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.SeAgregaVariosProductos());
    }

    @Entonces("el deberia visualizar el numero de productos en su carrito y el monto subtotal")
    public void elDeberiaVisualizarElNumeroDeProductosEnSuCarritoYElMontoSubtotal() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Es.lblVisibleSubtotales(),Matchers.equalTo(true)));
    }

    @Cuando("el usuario escoge un producto no disponible")
    public void elUsuarioEscogeUnProductoNoDisponible() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.unProductoNoDisponible());
    }

    @Entonces("el deberia visualizar un mensaje que indique que el producto no esta disponible")
    public void elDeberiaVisualizarUnMensajeQueIndiqueQueElProductoNoEstaDisponible() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Es.lblVisibleProNoDisponible(),Matchers.equalTo(true)));
    }
}
