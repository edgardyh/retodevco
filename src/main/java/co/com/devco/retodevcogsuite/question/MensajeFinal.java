package co.com.devco.retodevcogsuite.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeFinal implements Question <String> {

    private Target obj;

    public MensajeFinal (Target obj) {
        this.obj = obj;
    }

    @Override
    public String answeredBy(Actor actor) {
        return obj.resolveFor(actor).getText();
    }
}
