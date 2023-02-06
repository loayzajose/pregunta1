package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleccionarSignUp implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleccionarSignUp.class);
    private final String SeleccionarSignUp;


    public SeleccionarSignUp(String SeleccionarSignUp){

        this.SeleccionarSignUp = SeleccionarSignUp;
    }
    public static Performable withSeleccionarSignUp(){
        LOGGER.info("selecciona SignUP: ");
        return Tasks.instrumented(SeleccionarSignUp.class,"");

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioDemoPage.SIGNUP)
        );

    }

}
