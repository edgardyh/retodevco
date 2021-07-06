package co.com.devco.retodevcogsuite.question;

import co.com.devco.retodevcogsuite.model.builders.AmazonBuilder;
import co.com.devco.retodevcogsuite.userinterface.AmazonProductoNoDisponiblePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class MensajeAmazonNoDisponible implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(AmazonProductoNoDisponiblePage.LBL_FINAL_DINAMICO
                .of(AmazonBuilder.con().unDatoAmazon().getPianonodisponible())).viewedBy(actor).asBoolean();
    }
}
