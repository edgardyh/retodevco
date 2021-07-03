package co.com.devco.retodevcogsuite.model.builders;

import co.com.devco.retodevcogsuite.model.DatosCorreo;
import co.com.devco.retodevcogsuite.util.Builder;

public class DatosBuilder implements Builder <DatosCorreo> {

    public String nomcrearcuenta;
    public String apecrearcuenta;
    public String contracrearcuenta;
    public String usucrearcuenta;

    public DatosBuilder(){
        this.nomcrearcuenta = "";
        this.apecrearcuenta = "";
        this.contracrearcuenta = "";
        this.usucrearcuenta = "";
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

    public DatosCorreo unDatosCorreo(){
        conNomcrearcuenta("RobotPrueba");
        conApecrearcuenta("edgar");
        conContracrearcuenta("robotparapruebasautomatizadas");
        conUsucrearcuenta("r.r.bot.prueba");
        return build();
    }

    public String getNomcrearcuenta() { return nomcrearcuenta; }

    public String getApecrearcuenta() { return apecrearcuenta;  }

    public String getContracrearcuenta() { return contracrearcuenta; }

    public String getUsucrearcuenta() { return usucrearcuenta; }
}
