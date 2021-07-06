package co.com.devco.retodevcogsuite.task;


import co.com.devco.retodevcogsuite.model.builders.ContactosBuilder;
import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;
import co.com.devco.retodevcogsuite.userinterface.BandejaDeContactosPage;
import co.com.devco.retodevcogsuite.userinterface.IngresoCorreoPage;
import co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage;
import co.com.devco.retodevcogsuite.util.constant.CostantesTiempo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import static co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage.INP_CONTRA_INICIO_SESION;
import static co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage.INP_INI_SESION_DINAMICO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarContactos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
        actor.attemptsTo(
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getCorreodefinido()).into(INP_INI_SESION_DINAMICO.of("Correo electrónico o teléfono")),
                Click.on(IngresoCorreoPage.BTN_SIGUIENTE),
                WaitUntil.the(INP_CONTRA_INICIO_SESION,isVisible()).forNoMoreThan(4).seconds(),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getContracorreodefinido()).into(INP_CONTRA_INICIO_SESION),
                Click.on(InicioDeSesionPage.BTN_SIGUIENTE_INICIO_SESION),
                Click.on(BandejaDeContactosPage.ELEMENTO_DINAMICO.of("Crear contacto")),
                WaitUntil.the(BandejaDeContactosPage.SLC_CREAR_UN_CONTACTO,isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(BandejaDeContactosPage.SLC_CREAR_UN_CONTACTO),
                Enter.theValue(ContactosBuilder.con().unDatosContactos().getNombrecontacto1()).into(BandejaDeContactosPage.INP_FORM_DINAMICO.of("Nombre")),
                Enter.theValue(ContactosBuilder.con().unDatosContactos().getApecontacto1()).into(BandejaDeContactosPage.INP_FORM_DINAMICO.of("Apellidos")),
                Enter.theValue(ContactosBuilder.con().unDatosContactos().getNro1()).into(BandejaDeContactosPage.INP_FORM_DINAMICO.of("Teléfono")),
                Click.on(BandejaDeContactosPage.BTN_GUARDAR_CONTACTO)
        );
        actor.attemptsTo(
                Click.on(BandejaDeContactosPage.BTN_PESTANA_CONTACTOS),
                Click.on(BandejaDeContactosPage.LBL_CONTACTO_CREADO.of(ContactosBuilder.con().unDatosContactos().getNombrecontacto1()+" "+ContactosBuilder.con().unDatosContactos().getApecontacto1())),
                WaitUntil.the(BandejaDeContactosPage.LBL_FINAL_CINCO, isVisible()).forNoMoreThan(CostantesTiempo.TIEMPO_10).seconds()
        );
    }
}
