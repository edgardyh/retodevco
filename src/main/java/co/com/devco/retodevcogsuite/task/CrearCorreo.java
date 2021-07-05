package co.com.devco.retodevcogsuite.task;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;
import co.com.devco.retodevcogsuite.userinterface.IngresoCorreoPage;
import co.com.devco.retodevcogsuite.util.constant.CostantesTiempo;
import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Clock;

import static co.com.devco.retodevcogsuite.userinterface.IngresoCorreoPage.*;

public class CrearCorreo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INP_CREAR_CUENTA),
                Click.on(LBX_PARA_MI),
                Click.on(BTN_SIGUIENTE),
                Click.on(BTN_SIGUIENTE),
                Click.on(LBL_VALIDACION_CAMPO_NOMBREYAPELLIDO),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getNomcrearcuenta()).into(INP_DATOS_PARA_CREAR_CUENTA.of("firstName")),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getUsucrearcuenta()).into(INP_DATOS_PARA_CREAR_CUENTA.of("Username")),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getContracrearcuenta()).into(INP_DATOS_PARA_CREAR_CUENTA.of("Passwd")),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getContracrearcuenta()).
                        into(INP_DATOS_PARA_CREAR_CUENTA.of("ConfirmPasswd")),
                Click.on(BTN_SIGUIENTE),
                Click.on(LBL_VALIDACION_CAMPOAPELLIDO),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getApecrearcuenta()).into(INP_DATOS_PARA_CREAR_CUENTA.of("lastName")),
                Click.on(BTN_SIGUIENTE),
                WaitFor.seconds(CostantesTiempo.TIEMPO_10),
                Enter.theValue("42").into(INP_NRO_TELEFONO),
                Click.on(BTN_SIGUIENTE),
                Click.on(LBL_VALIDACION_NRO_TELFONO)

        );
    }
}
