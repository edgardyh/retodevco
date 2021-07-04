package co.com.devco.retodevcogsuite.model;

import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;

public class DatosCorreo {

    public String nomcrearcuenta;
    public String apecrearcuenta;
    public String contracrearcuenta;
    public String usucrearcuenta;

    public String correodefinido;
    public String contracorreodefinido;

    public String correo2;
    public String asunto2;
    public String descripcion2;
    public String asunto3;
    public String descripcion3;



    public DatosCorreo(final DatosBuilder datosBuilder){
        this.nomcrearcuenta = datosBuilder.nomcrearcuenta;
        this.apecrearcuenta = datosBuilder.apecrearcuenta;
        this.contracrearcuenta = datosBuilder.contracrearcuenta;
        this.usucrearcuenta = datosBuilder.usucrearcuenta;
        this.correodefinido = datosBuilder.correodefinido;
        this.contracorreodefinido = datosBuilder.contracorreodefinido;
        this.correo2 = datosBuilder.correo2;
        this.asunto2 = datosBuilder.asunto2;
        this.descripcion2 = datosBuilder.descripcion2;
        this.asunto3 = datosBuilder.asunto3;
        this.descripcion3 = datosBuilder.descripcion3;
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

    public String getCorreodefinido() { return correodefinido; }

    public String getContracorreodefinido() { return contracorreodefinido; }

    public String getCorreo2() { return correo2; }

    public String getAsunto2() { return asunto2; }

    public String getDescripcion2() { return descripcion2; }

    public String getAsunto3() { return asunto3; }

    public String getDescripcion3() { return descripcion3; }
}
