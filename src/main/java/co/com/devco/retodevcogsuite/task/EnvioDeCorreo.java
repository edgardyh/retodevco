package co.com.devco.retodevcogsuite.task;

import co.com.devco.retodevcogsuite.model.builders.DatosBuilder;
import co.com.devco.retodevcogsuite.userinterface.BandejaDeCorreoPage;
import co.com.devco.retodevcogsuite.userinterface.IngresoCorreoPage;
import co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.retodevcogsuite.userinterface.InicioDeSesionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EnvioDeCorreo implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IngresoCorreoPage.BTN_SIGUIENTE),
                Click.on(InicioDeSesionPage.INP_VALIDACION_CAMPO_VACIO),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getCorreodefinido()).into(INP_INI_SESION_DINAMICO.of("Correo electrónico o teléfono")),
                Click.on(IngresoCorreoPage.BTN_SIGUIENTE),
                WaitUntil.the(InicioDeSesionPage.BTN_SIGUIENTE_INICIO_SESION,isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(InicioDeSesionPage.BTN_SIGUIENTE_INICIO_SESION),
                Click.on(LBL_INICIO_SESION_DINAMICO.of("Introducir una contraseña")),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getContracorreodefinido()).into(INP_CONTRA_INICIO_SESION),
                Click.on(InicioDeSesionPage.BTN_SIGUIENTE_INICIO_SESION),
                Click.on(INP_INICIO_SESION_DINAMICO.of("Redactar")),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getCorreo2()).into(BandejaDeCorreoPage.INP_DESTINATARIO),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getAsunto2()).into(BandejaDeCorreoPage.INP_ASUNTO),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getDescripcion2()).into(BandejaDeCorreoPage.INP_DESCRIPCION),
                Click.on(INP_INICIO_SESION_DINAMICO.of("Enviar")),
                WaitUntil.the(INP_INICIO_SESION_DINAMICO.of("Redactar"),isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(INP_INICIO_SESION_DINAMICO.of("Redactar")),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getCorreo2()).into(BandejaDeCorreoPage.INP_DESTINATARIO),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getAsunto3()).into(BandejaDeCorreoPage.INP_ASUNTO),
                Enter.theValue(DatosBuilder.con().unDatosCorreo().getDescripcion3()).into(BandejaDeCorreoPage.INP_DESCRIPCION),
                Click.on(INP_INICIO_SESION_DINAMICO.of("Enviar")),
                WaitUntil.the(INP_INICIO_SESION_DINAMICO.of("Enviados"),isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(INP_INICIO_SESION_DINAMICO.of("Enviados")),
                Click.on(BandejaDeCorreoPage.LBL_PRIMER_CORREO_ENVIADO.of(DatosBuilder.con().unDatosCorreo().getAsunto2())),
                Click.on(BandejaDeCorreoPage.BTN_ATRAS),
                Click.on(BandejaDeCorreoPage.LBL_SEGUNDO_CORREO_ENVIADO.of(DatosBuilder.con().unDatosCorreo().getAsunto3()))
        );
    }
}
