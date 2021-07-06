package co.com.devco.retodevcogsuite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonProductoNoDisponiblePage {

    public static final Target INP_BUSCAR = Target.the("input buscar")
            .located(By.id("twotabsearchtextbox"));
    public static final Target ELEMENTO_DINAMICO = Target.the("elemento dinamico")
            .locatedBy("//*[text()='{0}']");
    public static final Target LBL_FINAL_DINAMICO = Target.the("elemento dinamico")
            .locatedBy("//*[text()='{0}']");
}
