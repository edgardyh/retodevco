package co.com.devco.retodevcogsuite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BandejaDeCorreoPage {

    public static final Target INP_DESTINATARIO = Target.the("input para")
            .located(By.xpath("//*[@aria-label='Para']"));
    public static final Target INP_ASUNTO = Target.the("asunto del correo")
            .located(By.xpath("//input[@aria-label='Asunto']"));
    public static final Target INP_DESCRIPCION = Target.the("descripcion del correo")
            .located(By.xpath("//div[@aria-label='Cuerpo del mensaje']"));
    public static final Target LBL_PRIMER_CORREO_ENVIADO = Target.the("label de primer correo enviado")
            .locatedBy("(//*[text()='{0}'])[2]");
    public static final Target LBL_SEGUNDO_CORREO_ENVIADO = Target.the("label Correo 2 enviado")
            .locatedBy("(//*[text()='{0}'])[2]");
    public static final Target BTN_ATRAS = Target.the("btn atras").located(By.xpath("(//div[@class='asa'])[21]"));
    public static final Target LBL_FINAL_ASUNTO = Target.the("asunto del ultimo correo enviado")
            .located(By.xpath("//h2[text()='Notificación de credito Hipotecario']"));



}
