package co.com.devco.retodevcogsuite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonPage {

    public static final Target INP_BUSCAR = Target.the("input buscar")
            .located(By.xpath("//*[@aria-label='Buscar']"));
    public static final Target LBL_EDIFICE_HOMBRE = Target.the("label edifice")
            .located(By.xpath("//*[text()='Casio EF527D-1AV \"Edifice\" Reloj multifunción de acero inoxidable para hombre']"));
    public static final Target SLC_CANTIDAD = Target.the("selec cantidad")
            .located(By.xpath("(//*[@class='a-icon a-icon-dropdown'])[1]"));
    public static final Target SLC_CANTIDAD_ID = Target.the("selec cantidad")
            .located(By.id("a-autoid-6-announce"));
    public static final Target SLC_CANTIDAD_TRES = Target.the("select 3")
            .located(By.xpath("//*[@data-value='{\"stringVal\":\"3\"}']"));
    public static final Target BTN_AGREGAR_CARRO = Target.the("btn agregar al carrito")
            .located(By.xpath("//*[@value='Agregar al Carrito']"));
    public static final Target INP_LUPA_BUSCAR = Target.the("lupa buscar")
            .located(By.id("nav-search-submit-button"));
    public static final Target LBL_PRODUCTO_AGREGADO_AL_CARRITO = Target.the("mensaje producto agregado")
            .located(By.xpath("//*[@class='a-size-medium a-text-bold']"));
    public static final Target BTN_CARRO = Target.the("btn carro")
            .located(By.id("hlb-view-cart-announce"));
    public static final Target LBL_FINAL_SUBTOTALES = Target.the("numero de productos y subtotal")
            .located(By.xpath("(//div[@data-name='Subtotals'])[1]"));

}
