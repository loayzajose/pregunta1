package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarPassword implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarPassword.class);
    private final String IngresarPassword;


    public IngresarPassword(String IngresarPassword){

        this.IngresarPassword = IngresarPassword;
    }
    public static Performable withPassword(String IngresarPassword){
        LOGGER.info("ingresar password:"+IngresarPassword);
        return Tasks.instrumented(IngresarPassword.class,IngresarPassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarPassword).into(InicioDemoPage.PASSWORD)
        );
    }

}
