package co.com.devco.retodevcogsuite.question;

import co.com.devco.retodevcogsuite.userinterface.AmazonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class SubtotalesProductosAmazon implements Question<Boolean>  {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(AmazonPage.LBL_FINAL_SUBTOTALES).viewedBy(actor).asBoolean();
    }
}
