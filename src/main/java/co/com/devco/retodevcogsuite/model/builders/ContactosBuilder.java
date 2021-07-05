package co.com.devco.retodevcogsuite.model.builders;

import co.com.devco.retodevcogsuite.model.DatosContacto;
import co.com.devco.retodevcogsuite.util.Builder;

public class ContactosBuilder implements Builder <DatosContacto> {

    private String nombrecontacto1;
    private String apecontacto1;
    private String nro1;
    private String nombreevento;
    private String apecontacto2;
    private String nro2;

    public ContactosBuilder() {
        this.nombrecontacto1 = "";
        this.apecontacto1 = "";
        this.nro1 = "";
        this.nombreevento = "";
        this.apecontacto2 = "";
        this.nro2 = "";
    }

    public static ContactosBuilder con(){ return new ContactosBuilder();  }

    @Override
    public DatosContacto build() { return new DatosContacto(this); }

    public ContactosBuilder conNombrecontacto1(String nombrecontacto1) {
        this.nombrecontacto1 = nombrecontacto1;
        return this;
    }

    public ContactosBuilder conApecontacto1(String apecontacto1) {
        this.apecontacto1 = apecontacto1;
        return this;
    }

    public ContactosBuilder conNro1(String nro1) {
        this.nro1 = nro1;
        return this;
    }

    public ContactosBuilder conNombreevento(String nombreevento) {
        this.nombreevento = nombreevento;
        return this;
    }

    public ContactosBuilder conApecontacto2(String apecontacto2) {
        this.apecontacto2 = apecontacto2;
        return this;
    }

    public ContactosBuilder conNro2(String nro2) {
        this.nro2 = nro2;
        return this;
    }

    public DatosContacto unDatosContactos(){
        conNombrecontacto1("gabriel");
        conApecontacto1("Santos");
        conNro1("3225555");
        conNombreevento("Asociados al proyecto Fitness");
        conApecontacto2("Lopez");
        conNro2("3888888");
        return build();
    }

    public String getNombrecontacto1() { return nombrecontacto1; }

    public String getApecontacto1() { return apecontacto1; }

    public String getNro1() { return nro1; }

    public String getNombreevento() { return nombreevento; }

    public String getApecontacto2() { return apecontacto2; }

    public String getNro2() { return nro2; }
}
