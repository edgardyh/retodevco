package co.com.devco.retodevcogsuite.task;

import co.com.devco.retodevcogsuite.model.builders.AmazonBuilder;
import co.com.devco.retodevcogsuite.userinterface.AmazonPage;
import co.com.devco.retodevcogsuite.util.constant.CostantesTiempo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(AmazonBuilder.con().unDatoAmazon().getUnproducto()).into((AmazonPage.INP_BUSCAR)),
                Click.on(AmazonPage.INP_LUPA_BUSCAR),
                Click.on(AmazonPage.LBL_EDIFICE_HOMBRE),
                Click.on(AmazonPage.SLC_CANTIDAD_ID),
                Click.on(AmazonPage.SLC_CANTIDAD_TRES),
                Click.on(AmazonPage.BTN_AGREGAR_CARRO),
                WaitUntil.the(AmazonPage.LBL_PRODUCTO_AGREGADO_AL_CARRITO,isEnabled()).forNoMoreThan(CostantesTiempo.TIEMPO_10).seconds(),
                Click.on(AmazonPage.LBL_PRODUCTO_AGREGADO_AL_CARRITO)
        );
    }
}
