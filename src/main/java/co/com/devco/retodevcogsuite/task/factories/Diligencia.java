package co.com.devco.retodevcogsuite.task.factories;

import co.com.devco.retodevcogsuite.task.CrearCorreo;
import net.serenitybdd.screenplay.Tasks;

public class Diligencia {

    public static CrearCorreo seCreaCorreo() { return Tasks.instrumented(CrearCorreo.class); }

}
