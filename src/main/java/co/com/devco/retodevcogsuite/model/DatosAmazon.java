package co.com.devco.retodevcogsuite.model;

import co.com.devco.retodevcogsuite.model.builders.AmazonBuilder;
import co.com.devco.retodevcogsuite.model.builders.ContactosBuilder;

public class DatosAmazon {

    private String unproducto;
    private String piano;
    private String pianoyamaha;
    private String pianonodisponible;
    private String unproductoaire;
    private String aireacondi;
    private String unproductocama;
    private String cama;


    public DatosAmazon(final AmazonBuilder amazonBuilder) {
        this.unproducto = amazonBuilder.getUnproducto();
        this.piano = amazonBuilder.getPiano();
        this.pianoyamaha = amazonBuilder.getPianoyamaha();
        this.pianonodisponible = amazonBuilder.getPianonodisponible();
        this.unproductoaire = amazonBuilder.getUnproductoaire();
        this.aireacondi = amazonBuilder.getAireacondi();
        this.unproductocama = amazonBuilder.getUnproductocama();
        this.cama = amazonBuilder.getCama();
    }

    public String getUnproducto() { return unproducto; }

    public String getPiano() { return piano; }

    public String getPianoyamaha() { return pianoyamaha; }

    public String getPianonodisponible() { return pianonodisponible; }

    public String getUnproductoaire() { return unproductoaire; }

    public String getAireacondi() { return aireacondi; }

    public String getUnproductocama() { return unproductocama; }

    public String getCama() { return cama; }
}
