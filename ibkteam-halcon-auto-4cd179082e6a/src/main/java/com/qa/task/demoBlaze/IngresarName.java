package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarName implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarName.class);
    private final String IngresarName;


    public IngresarName(String IngresarName){

        this.IngresarName = IngresarName;
    }
    public static Performable withName(String IngresarName){
        LOGGER.info("ingresar name:"+IngresarName);
        return Tasks.instrumented(IngresarName.class,IngresarName);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarName).into(InicioDemoPage.NAME)
        );
    }

}
