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
    public static final Target BTN_ELIMINAR_CORREO = Target.the("btn atras").located(By.xpath("(//div[@class='asa'])[24]"));
    public static final Target BTN_MAS = Target.the("btn mas").located(By.xpath("//span//span[text()='Más']"));
    public static final Target BTN_PESTANA_PAPELERA = Target.the("inputs de Login").located(By.xpath("//*[text()='Papelera']"));
    public static final Target BTN_ELIMINAR_DEFINITIVAMENTE = Target.the("btn eliminar definitivamente").located(By.xpath("(//*[text()='Eliminar definitivamente'])[2]"));
    public static final Target LBL_FINAL_PAPELERA_LIMPIA = Target.the("inputs de Login").located(By.xpath("//tr//td[text()='No hay conversaciones en la papelera.']"));
    public static final Target BTN_CREAR_DOS = Target.the("boton crear").located(By.xpath("//span[@class='VfPpkd-Q0XOV']"));
    public static final Target INP_AGREGAR_TITULO_EVENTO = Target.the("titulo evento")
            .located(By.xpath("//input[@aria-label='Añade un título']"));
    public static final Target INP_FECHA_INICIAL = Target.the("fecha inicio")
            .located(By.xpath("//*[@data-key='startDate']"));
    public static final Target CLD_DIA_FECHA_INCIO = Target.the("fecha evento inicio")
            .located(By.xpath("(//span[@data-date='20210715'])[2]"));
    public static final Target CHK_TODO_EL_DIA = Target.the("check todo el dia")
            .located(By.xpath("(//div[@class='uHMk6b fsHoPb'])[6]"));
    public static final Target INP_FECHA_FINAL = Target.the("input fecha fin")
            .located(By.xpath("//input[@aria-label='Fecha de finalización']"));
    public static final Target CLD_DIA_FECHA_FINAL = Target.the("fecha evento inicio")
            .located(By.xpath("(//span[@data-date='20210714'])[3]"));
    public static final Target BTN_GUARDAR_EVENTO = Target.the("fecha evento fin")
            .located(By.xpath("//span[text()='Guardar']"));
    public static final Target LBL_EVENTO_EN_CALENDARIO = Target.the("fecha evento fin")
            .locatedBy("(//*[text()='{0}'])[1]");
    public static final Target LBL_FINAL_FECHA = Target.the("fecha evento fin")
            .locatedBy("(//div[text()='Jueves, 15 de julio'])");
    public static final Target ICON_EDITAR = Target.the("ícono editar")
            .locatedBy("(//*[local-name()='svg' and @class=' NMm5M'])[5]");
    public static final Target INP_FINAL_EDITAR_EVENTO = Target.the("btn editar evento")
            .locatedBy("//*[@value='Asociados al proyecto Fitness']");


}
