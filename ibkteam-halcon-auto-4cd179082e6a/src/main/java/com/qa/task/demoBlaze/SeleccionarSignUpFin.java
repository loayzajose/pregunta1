package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleccionarSignUpFin implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleccionarSignUpFin.class);
    private final String SeleccionarSignUpFin;


    public SeleccionarSignUpFin(String SeleccionarSignUpFin){

        this.SeleccionarSignUpFin = SeleccionarSignUpFin;
    }
    public static Performable withSeleccionarSignUpFin(){
        LOGGER.info("selecciona SignUP: ");
        return Tasks.instrumented(SeleccionarSignUpFin.class,"");

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioDemoPage.SIGNUPFIN)
        );

    }

}
