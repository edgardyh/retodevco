package co.com.devco.retodevcogsuite.question.factories;

import co.com.devco.retodevcogsuite.question.CorreosEnviados;
import co.com.devco.retodevcogsuite.question.MensajeFinal;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Es {

    public Es (){ }

    public static Question <String> lblCrearCorreoNumTelefono (Target obj){
        return new MensajeFinal(obj);
    }
    public static Question <String> lblCorreosEnviados (Target obj){ return new CorreosEnviados(obj); }
    public static Question <String> lblFinalPapeleraVacia (Target obj){
        return new MensajeFinal(obj);
    }
    public static Question <String> lblFinalNombreContacto (Target obj){
        return new MensajeFinal(obj);
    }

}
