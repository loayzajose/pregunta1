package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleccionarLogin implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleccionarLogin.class);
    private final String SeleccionarLogin;


    public SeleccionarLogin(String SeleccionarLogin){

        this.SeleccionarLogin = SeleccionarLogin;
    }
    public static Performable withSeleccionarLogin(){
        LOGGER.info("selecciona Login: ");
        return Tasks.instrumented(SeleccionarLogin.class,"");

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioDemoPage.BOTON_LOGIN)
        );

    }

}
