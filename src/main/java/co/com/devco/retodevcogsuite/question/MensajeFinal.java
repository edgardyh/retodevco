package co.com.devco.retodevcogsuite.question;

import co.com.devco.retodevcogsuite.util.constant.CostantesTiempo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class MensajeFinal implements Question <String> {

    private Target obj;

    public MensajeFinal (Target obj) {
        this.obj = obj;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(obj, WebElementStateMatchers.isVisible()).forNoMoreThan(CostantesTiempo.TIEMPO_10).seconds());
        String var= obj.resolveFor(actor).getText();
        return var;
    }
}
