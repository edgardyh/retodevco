package co.com.devco.retodevcogsuite.task;

import co.com.devco.retodevcogsuite.model.builders.AmazonBuilder;
import co.com.devco.retodevcogsuite.userinterface.AmazonPage;
import co.com.devco.retodevcogsuite.userinterface.AmazonProductoNoDisponiblePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarVariosProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(AmazonBuilder.con().unDatoAmazon().getUnproductoaire()).into(AmazonPage.INP_BUSCAR),
                Click.on(AmazonPage.INP_LUPA_BUSCAR),
                Click.on(AmazonProductoNoDisponiblePage.ELEMENTO_DINAMICO.of(AmazonBuilder.con().unDatoAmazon().getAireacondi())),
                Click.on(AmazonPage.BTN_AGREGAR_CARRO),
                Enter.theValue(AmazonBuilder.con().unDatoAmazon().getUnproductocama()).into(AmazonPage.INP_BUSCAR),
                Click.on(AmazonPage.INP_LUPA_BUSCAR),
                Click.on(AmazonProductoNoDisponiblePage.ELEMENTO_DINAMICO.of(AmazonBuilder.con().unDatoAmazon().getCama())),
                Click.on(AmazonPage.BTN_AGREGAR_CARRO),
                Click.on(AmazonPage.BTN_CARRO),
                Click.on(AmazonPage.LBL_FINAL_SUBTOTALES)
        );
    }
}
