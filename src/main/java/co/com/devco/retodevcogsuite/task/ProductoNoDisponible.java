package co.com.devco.retodevcogsuite.task;

import co.com.devco.retodevcogsuite.model.builders.AmazonBuilder;
import co.com.devco.retodevcogsuite.userinterface.AmazonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.retodevcogsuite.userinterface.AmazonProductoNoDisponiblePage.*;

public class ProductoNoDisponible implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(AmazonBuilder.con().unDatoAmazon().getPiano()).into(INP_BUSCAR),
                Click.on(AmazonPage.INP_LUPA_BUSCAR),
                Click.on(ELEMENTO_DINAMICO.of(AmazonBuilder.con().unDatoAmazon().getPianoyamaha())),
                Click.on(LBL_FINAL_DINAMICO.of(AmazonBuilder.con().unDatoAmazon().getPianonodisponible()))
        );
    }
}
