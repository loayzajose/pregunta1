package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarUsername implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarUsername.class);
    private final String IngresarUsername;


    public IngresarUsername(String IngresarUsername){

        this.IngresarUsername = IngresarUsername;
    }
    public static Performable withUsername(String IngresarUsername){
        LOGGER.info("ingresar username:"+IngresarUsername);
        return Tasks.instrumented(IngresarUsername.class,IngresarUsername);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarUsername).into(InicioDemoPage.USERNAME)
        );
    }

}
