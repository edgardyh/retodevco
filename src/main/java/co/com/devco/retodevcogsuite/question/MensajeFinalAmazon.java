package co.com.devco.retodevcogsuite.question;

import co.com.devco.retodevcogsuite.userinterface.AmazonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;


public class MensajeFinalAmazon implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(AmazonPage.LBL_PRODUCTO_AGREGADO_AL_CARRITO).viewedBy(actor).asBoolean();
    }
}
