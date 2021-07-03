package co.com.devco.retodevcogsuite.model;

import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;

public class DatosCorreo {

    public String nomcrearcuenta;
    public String apecrearcuenta;
    public String contracrearcuenta;
    public String usucrearcuenta;

    public DatosCorreo(final DatosBuilder datosBuilder){
        this.nomcrearcuenta = datosBuilder.nomcrearcuenta;
        this.apecrearcuenta = datosBuilder.apecrearcuenta;
        this.contracrearcuenta = datosBuilder.contracrearcuenta;
        this.usucrearcuenta = datosBuilder.usucrearcuenta;
    }

    public String getNomcrearcuenta() {
        return nomcrearcuenta;
    }

    public String getApecrearcuenta() {
        return apecrearcuenta;
    }

    public String getContracrearcuenta() {
        return contracrearcuenta;
    }

    public String getUsucrearcuenta() {
        return usucrearcuenta;
    }

}
