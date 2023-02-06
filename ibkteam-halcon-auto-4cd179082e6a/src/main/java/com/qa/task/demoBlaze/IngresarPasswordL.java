package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarPasswordL implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarPasswordL.class);
    private final String IngresarPasswordL;


    public IngresarPasswordL(String IngresarPasswordL){

        this.IngresarPasswordL = IngresarPasswordL;
    }
    public static Performable withPasswordl(String IngresarPasswordL){
        LOGGER.info("ingresar password:"+IngresarPasswordL);
        return Tasks.instrumented(IngresarPasswordL.class,IngresarPasswordL);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarPasswordL).into(InicioDemoPage.PASSWORDL)
        );
    }

}
