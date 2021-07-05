package co.com.devco.retodevcogsuite.task.factories;

import co.com.devco.retodevcogsuite.task.*;
import net.serenitybdd.screenplay.Tasks;

public class Diligencia {

    public static CrearCorreo seValidaNoCompletarCamposDeCorreo() { return Tasks.instrumented(CrearCorreo.class); }
    public static EnvioDeCorreo seEnviaCorreo() { return Tasks.instrumented(EnvioDeCorreo.class); }
    public static EliminarCorreo seEliminaCorreo() { return Tasks.instrumented(EliminarCorreo.class); }
    public static AgregarContactosYEtiquetas seAgreganContactos() { return Tasks.instrumented(AgregarContactosYEtiquetas.class); }
    public static CrearEventoCalendario seCreaEventoCalendario() { return Tasks.instrumented(CrearEventoCalendario.class); }
}
