package co.com.devco.retodevcogsuite.model;

import co.com.devco.retodevcogsuite.model.builders.ContactosBuilder;
import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;

public class DatosContacto {

    private String nombrecontacto1;
    private String apecontacto1;
    private String nro1;
    private String nombreevento;
    private String apecontacto2;
    private String nro2;

    public DatosContacto(final ContactosBuilder contactosBuilder) {
        this.nombrecontacto1 = contactosBuilder.getNombrecontacto1();
        this.apecontacto1 = contactosBuilder.getApecontacto1();
        this.nro1 = contactosBuilder.getNro1();
        this.nombreevento = contactosBuilder.getNombreevento();
        this.apecontacto2 = contactosBuilder.getApecontacto2();
        this.nro2 = contactosBuilder.getNro2();
    }

    public String getNombrecontacto1() { return nombrecontacto1; }

    public String getApecontacto1() { return apecontacto1; }

    public String getNro1() { return nro1; }

    public String getNombreevento() { return nombreevento; }

    public String getApecontacto2() { return apecontacto2; }

    public String getNro2() { return nro2; }
}
