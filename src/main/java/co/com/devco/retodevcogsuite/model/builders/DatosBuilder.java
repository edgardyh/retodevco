package co.com.devco.retodevcogsuite.model.builders;

import co.com.devco.retodevcogsuite.model.DatosCorreo;
import co.com.devco.retodevcogsuite.util.Builder;

public class DatosBuilder implements Builder <DatosCorreo> {

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

    public DatosBuilder(){
        this.nomcrearcuenta = "";
        this.apecrearcuenta = "";
        this.contracrearcuenta = "";
        this.usucrearcuenta = "";
        this.correodefinido = "";
        this.contracorreodefinido = "";
        this.correo2 = "";
        this.asunto2 = "";
        this.descripcion2 = "";
        this.asunto3 = "";
        this.descripcion3 = "";
    }

    public static DatosBuilder con(){ return new DatosBuilder();  }

    @Override
    public DatosCorreo build() { return new DatosCorreo(this); }

    public DatosBuilder conNomcrearcuenta(String nomcrearcuenta) {
        this.nomcrearcuenta = nomcrearcuenta;
        return this;
    }

    public DatosBuilder conApecrearcuenta(String apecrearcuenta) {
        this.apecrearcuenta = apecrearcuenta;
        return this;
    }

    public DatosBuilder conContracrearcuenta(String contracrearcuenta) {
        this.contracrearcuenta = contracrearcuenta;
        return this;
    }

    public DatosBuilder conUsucrearcuenta(String usucrearcuenta) {
        this.usucrearcuenta = usucrearcuenta;
        return this;
    }

    public DatosBuilder conCorreodefinido(String correodefinido) {
        this.correodefinido = correodefinido;
        return this;
    }

    public DatosBuilder conContracorreodefinido(String contracorreodefinido) {
        this.contracorreodefinido = contracorreodefinido;
        return this;
    }

    public DatosBuilder conCorreo2(String correo2) {
        this.correo2 = correo2;
        return this;
    }

    public DatosBuilder conAsunto2(String asunto2) {
        this.asunto2 = asunto2;
        return this;
    }

    public DatosBuilder conDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
        return this;
    }

    public DatosBuilder conAsunto3(String asunto3) {
        this.asunto3 = asunto3;
        return this;
    }

    public DatosBuilder conDescripcion3(String descripcion3) {
        this.descripcion3 = descripcion3;
        return this;
    }

    public DatosCorreo unDatosCorreo(){
        conNomcrearcuenta("RobotPrueba");
        conApecrearcuenta("edgar");
        conContracrearcuenta("robotparapruebasautomatizadas");
        conUsucrearcuenta("r.r.bot.prueba");
        conCorreodefinido("zretodevcoo@gmail.com");
        conContracorreodefinido("iniciar sesion");
        conCorreo2("edgardatainfo2@gmail.com");
        conAsunto2("Favorecimiento de subsidio de vivienda");
        conDescripcion2("Sr Luis! El programa del Gobierno Nacional que facilita la adquisición de una vivienda nueva en " +
                "zona urbana de cualquier municipio del país a través de un subsidio familiar de vivienda y/o " +
                "cobertura a la tasa de interés");
        conAsunto3("Notificación de credito Hipotecario");
        conDescripcion3("Es una alternativa para que cumplas la meta de tener tu casa propia, a través de un " +
                "préstamo a largo plazo en el que pagas cuotas mensuales y el inmueble queda como garantía.");
        return build();
    }

    public String getNomcrearcuenta() { return nomcrearcuenta; }

    public String getApecrearcuenta() { return apecrearcuenta;  }

    public String getContracrearcuenta() { return contracrearcuenta; }

    public String getUsucrearcuenta() { return usucrearcuenta; }

    public String getCorreodefinido() { return correodefinido; }

    public String getContracorreodefinido() { return contracorreodefinido; }

    public String getCorreo2() { return correo2; }

    public String getAsunto2() { return asunto2; }

    public String getDescripcion2() { return descripcion2; }

    public String getAsunto3() { return asunto3; }

    public String getDescripcion3() { return descripcion3; }
}
