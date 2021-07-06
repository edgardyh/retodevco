package co.com.devco.retodevcogsuite.question.factories;

import co.com.devco.retodevcogsuite.question.*;
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
    public static Question <String> lblFinalNombreDeEvento (Target obj){ return new MensajeCalendarioFinal(obj); }
    public static Question <Boolean> lblVisibleProducto(){ return new MensajeFinalAmazon(); }
    public static Question <Boolean> lblVisibleProNoDisponible(){ return new MensajeAmazonNoDisponible(); }
    public static Question <Boolean> lblVisibleSubtotales(){ return new SubtotalesProductosAmazon(); }

}
