package co.com.devco.retodevcogsuite.task.factories;

import co.com.devco.retodevcogsuite.task.CrearCorreo;
import co.com.devco.retodevcogsuite.task.EliminarCorreo;
import co.com.devco.retodevcogsuite.task.EnvioDeCorreo;
import net.serenitybdd.screenplay.Tasks;

public class Diligencia {

    public static CrearCorreo seValidaNoCompletarCamposDeCorreo() { return Tasks.instrumented(CrearCorreo.class); }
    public static EnvioDeCorreo seEnviaCorreo() { return Tasks.instrumented(EnvioDeCorreo.class); }
    public static EliminarCorreo seEliminaCorreo() { return Tasks.instrumented(EliminarCorreo.class); }

}
