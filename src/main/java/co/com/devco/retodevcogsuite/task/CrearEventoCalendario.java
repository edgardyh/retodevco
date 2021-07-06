package co.com.devco.retodevcogsuite.task;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.devco.retodevcogsuite.model.builders.ContactosBuilder;
import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;
import co.com.devco.retodevcogsuite.userinterface.IngresoCorreoPage;
import co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage;
import co.com.devco.retodevcogsuite.util.constant.CostantesTiempo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.retodevcogsuite.userinterface.BandejaDeCorreoPage.*;
import static co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CrearEventoCalendario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getCorreodefinido()).into(INP_INI_SESION_DINAMICO.of("Correo electrónico o teléfono")),
                Click.on(IngresoCorreoPage.BTN_SIGUIENTE),
                WaitFor.seconds(CostantesTiempo.TIEMPO_5),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getContracorreodefinido()).into(INP_CONTRA_INICIO_SESION),
                Click.on(InicioDeSesionPage.BTN_SIGUIENTE_INICIO_SESION),
                WaitFor.seconds(CostantesTiempo.TIEMPO_10),
                Click.on(BTN_CREAR_DOS),
                WaitUntil.the(INP_AGREGAR_TITULO_EVENTO,isEnabled()).forNoMoreThan(CostantesTiempo.TIEMPO_60).seconds(),
                Enter.theValue(ContactosBuilder.con().unDatosContactos().getNombreevento())
                        .into(INP_AGREGAR_TITULO_EVENTO),
                Click.on(INP_FECHA_INICIAL),
                WaitFor.seconds(CostantesTiempo.TIEMPO_5),
                Click.on(CLD_DIA_FECHA_INCIO),
                Click.on(CHK_TODO_EL_DIA),
                Click.on(INP_FECHA_FINAL),
                Click.on(CLD_DIA_FECHA_FINAL),
                Click.on(BTN_GUARDAR_EVENTO),
                Click.on(LBL_EVENTO_EN_CALENDARIO.of(ContactosBuilder.con().unDatosContactos().getNombreevento())),
                Click.on(LBL_FINAL_FECHA),
                Click.on(ICON_EDITAR),
                Click.on(INP_FINAL_EDITAR_EVENTO)
        );

    }
}
