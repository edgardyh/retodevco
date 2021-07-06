package co.com.devco.retodevcogsuite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioDeSesionPage {

    public static final Target INP_INICIO_SESION_DINAMICO = Target.the("inputs de Login").locatedBy("//*[text()='{0}']");
    public static final Target LBL_INICIO_SESION_DINAMICO = Target.the("lbl de Login para no confunir con input").locatedBy("//*[text()='{0}']");
    public static final Target INP_INI_SESION_DINAMICO = Target.the("inputs de Login").locatedBy("//*[@aria-label='Correo electrónico o teléfono']");
    public static final Target INP_CONTRA_INICIO_SESION = Target.the("inputs de contrasena login").located(By.xpath("//*[@type='password']"));
    public static final Target BTN_SIGUIENTE_INICIO_SESION = Target.the("btn siguiente").
            located(By.xpath("(//button[@type='button'])[2]"));
    public static final Target INP_VALIDACION_CAMPO_VACIO = Target.the("label validación de Login").
            located(By.xpath("//*[text()='Introduce una dirección de correo electrónico o un número de teléfono']"));

}
