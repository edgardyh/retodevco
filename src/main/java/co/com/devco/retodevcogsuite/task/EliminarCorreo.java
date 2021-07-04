package co.com.devco.retodevcogsuite.task;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;
import co.com.devco.retodevcogsuite.userinterface.BandejaDeCorreoPage;
import co.com.devco.retodevcogsuite.userinterface.IngresoCorreoPage;
import co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage.*;

public class EliminarCorreo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getCorreodefinido()).into(INP_INI_SESION_DINAMICO.of("Correo electrónico o teléfono")),
                Click.on(IngresoCorreoPage.BTN_SIGUIENTE),
                WaitFor.seconds(6),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getContracorreodefinido()).into(INP_CONTRA_INICIO_SESION),
                Click.on(InicioDeSesionPage.BTN_SIGUIENTE_INICIO_SESION),
                WaitFor.seconds(10),
                Click.on(INP_INICIO_SESION_DINAMICO.of("Enviados")),
                Click.on(BandejaDeCorreoPage.LBL_PRIMER_CORREO_ENVIADO.of(DatosBuilder.con().unDatosCorreo().getAsunto2())),
                Click.on(BandejaDeCorreoPage.BTN_ELIMINAR_CORREO),
                Click.on(BandejaDeCorreoPage.LBL_SEGUNDO_CORREO_ENVIADO.of(DatosBuilder.con().unDatosCorreo().getAsunto3())),
                Click.on(BandejaDeCorreoPage.BTN_ELIMINAR_CORREO),
                Click.on(BandejaDeCorreoPage.BTN_MAS),
                WaitFor.seconds(5),
                Scroll.to(BandejaDeCorreoPage.BTN_PESTANA_PAPELERA),
                Click.on(BandejaDeCorreoPage.BTN_PESTANA_PAPELERA),
                Click.on(BandejaDeCorreoPage.LBL_PRIMER_CORREO_ENVIADO.of(DatosBuilder.con().unDatosCorreo().getAsunto2())),
                Click.on(BandejaDeCorreoPage.BTN_ELIMINAR_DEFINITIVAMENTE),
                Click.on(BandejaDeCorreoPage.LBL_SEGUNDO_CORREO_ENVIADO.of(DatosBuilder.con().unDatosCorreo().getAsunto3())),
                Click.on(BandejaDeCorreoPage.BTN_ELIMINAR_DEFINITIVAMENTE),
                WaitFor.seconds(10),
                Click.on(BandejaDeCorreoPage.BTN_PESTANA_PAPELERA),
                JavaScriptClick.on(BandejaDeCorreoPage.LBL_FINAL_PAPELERA_LIMPIA)
        );
    }
}
