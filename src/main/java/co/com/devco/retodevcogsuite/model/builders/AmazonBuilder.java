package co.com.devco.retodevcogsuite.model.builders;

import co.com.devco.retodevcogsuite.model.DatosAmazon;
import co.com.devco.retodevcogsuite.model.DatosContacto;
import co.com.devco.retodevcogsuite.util.Builder;

public class AmazonBuilder implements Builder<DatosAmazon> {

    private String unproducto;
    private String piano;
    private String pianoyamaha;
    private String pianonodisponible;
    private String unproductoaire;
    private String aireacondi;
    private String unproductocama;
    private String cama;

    public AmazonBuilder (){
        this.unproducto = "";
        this.piano = "";
        this.pianoyamaha = "";
        this.pianonodisponible = "";
        this.unproductoaire = "";
        this.aireacondi = "";
        this.unproductocama = "";
        this.cama = "";
    }

    public static AmazonBuilder con(){ return new AmazonBuilder();  }

    @Override
    public DatosAmazon build() {
        return new DatosAmazon(this);
    }


    public AmazonBuilder conUnproducto(String unproducto) {
        this.unproducto = unproducto;
        return this;
    }

    public AmazonBuilder conPiano(String piano) {
        this.piano = piano;
        return this;
    }

    public AmazonBuilder conPianoyamaha(String pianoyamaha) {
        this.pianoyamaha = pianoyamaha;
        return this;
    }

    public AmazonBuilder conPianonodisponible(String pianonodisponible) {
        this.pianonodisponible = pianonodisponible;
        return this;
    }

    public AmazonBuilder conUnproductoaire(String unproductoaire) {
        this.unproductoaire = unproductoaire;
        return this;
    }

    public AmazonBuilder conAireacondi(String aireacondi) {
        this.aireacondi = aireacondi;
        return this;
    }

    public AmazonBuilder conUnproductocama(String unproductocama) {
        this.unproductocama = unproductocama;
        return this;
    }

    public AmazonBuilder conCama(String cama) {
        this.cama = cama;
        return this;
    }

    public DatosAmazon unDatoAmazon(){
        conUnproducto("reloj edifice hombre");
        conPiano("piano yamaha psr s970");
        conPianoyamaha("Estación de trabajo digital Yamaha Genos de 76 teclas");
        conPianonodisponible("No disponible por el momento.");
        conUnproductoaire("aire acondicionado portatil");
        conAireacondi("YouGottaIt - Aire acondicionado portátil, recargable por evaporación con humidificador, " +
                "función de sincronización y oscilación, ventilador de aire acondicionado personal para " +
                "habitación pequeña, oficina, camping, coche, dormitorio");
        conUnproductocama("juego de camas");
        conCama("Amazon Basics - Juego de cama con colcha fruncida y plisada");
        return build();
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
