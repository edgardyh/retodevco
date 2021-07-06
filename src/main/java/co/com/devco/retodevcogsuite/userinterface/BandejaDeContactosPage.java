package co.com.devco.retodevcogsuite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BandejaDeContactosPage {

    public static final Target ELEMENTO_DINAMICO = Target.the("elemento dinamico")
            .locatedBy("//*[text()='{0}']");
    public static final Target SLC_CREAR_UN_CONTACTO = Target.the("select crear un contacto")
            .located(By.xpath("(//div[text()='Crear un contacto'])[1]"));
    public static final Target INP_FORM_DINAMICO = Target.the("inputs del formulario de contactos")
            .locatedBy("(//input[@aria-label='{0}'])[1]");
    public static final Target BTN_PESTANA_CONTACTOS = Target.the("pestaña contactos")
            .located(By.xpath("(//*[text()='Contactos'])[3]"));
    public static final Target LBL_CONTACTO_CREADO = Target.the("label del contacto creado")
            .locatedBy("(//*[text()='{0}' and @tabindex='0'])[2]");
    public static final Target LBL_FINAL_NOMBRE_CONTACO = Target.the("label final para validación")
            .locatedBy("(//div[text()='{0}'])[3]");
    public static final Target BTN_GUARDAR_CONTACTO = Target.the("boton guardar contacto")
            .located(By.xpath("//span[text()='Guardar']"));
    public static final Target LBL_FINAL_CINCO = Target.the("label de validación final")
            .located(By.xpath("(//*[@id='contactName'])[2]"));

}
