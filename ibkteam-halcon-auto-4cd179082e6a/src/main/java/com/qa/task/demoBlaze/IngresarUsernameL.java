package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarUsernameL implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarUsernameL.class);
    private final String IngresarUsernameL;


    public IngresarUsernameL(String IngresarUsernameL){

        this.IngresarUsernameL = IngresarUsernameL;
    }
    public static Performable withUsernameL(String IngresarUsernameL){
        LOGGER.info("ingresar username:"+IngresarUsernameL);
        return Tasks.instrumented(IngresarUsernameL.class,IngresarUsernameL);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarUsernameL).into(InicioDemoPage.USERNAMEL)
        );
    }

}
