package co.com.devco.retodevcogsuite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoCorreoPage {


    public static final Target BTN_USAR_OTRA_CUENTA = Target.the("Btn usar otra cuenta").located(By.xpath("//*[text()='Usar otra cuenta']"));
    public static final Target INP_CREAR_CUENTA = Target.the("Btn crear cuenta").located(By.xpath("//*[text()='Crear cuenta']"));
    public static final Target LBX_PARA_MI = Target.the("Lbl para mi").located(By.xpath("//*[text()='Para mí']"));
    public static final Target BTN_SIGUIENTE= Target.the("Btn siguiente").located(By.xpath("//*[text()='Siguiente']"));
    public static final Target LBL_VALIDACION_CAMPO_NOMBREYAPELLIDO = Target.the("Lbl validación")
            .located(By.xpath("//*[text()='Introduce el nombre y los apellidos']"));
    public static final Target LBL_VALIDACION_CAMPOAPELLIDO = Target.the("Lbl validación apellido")
            .located(By.xpath("//*[text()='Introduce tus apellidos.']"));
    public static final Target INP_DATOS_PARA_CREAR_CUENTA = Target.the("inputs de crear cuenta")
            .locatedBy(("//input[@name='{0}']"));
    public static final Target INP_NRO_TELEFONO = Target.the("número de telfono confirmación")
            .located(By.xpath("//input[@aria-label='Número de teléfono']"));
    public static final Target LBL_VALIDACION_NRO_TELFONO = Target.the("validación numero incorrecto")
            .located(By.xpath("//*[text()='El formato de este número de teléfono no se reconoce. Comprueba el país y el número.']"));

}
