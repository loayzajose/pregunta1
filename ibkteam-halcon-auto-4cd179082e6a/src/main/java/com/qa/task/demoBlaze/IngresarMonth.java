package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarMonth implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarMonth.class);
    private final String IngresarMonth;


    public IngresarMonth(String IngresarMonth){

        this.IngresarMonth = IngresarMonth;
    }
    public static Performable withMonth(String IngresarMonth){
        LOGGER.info("ingresar month:"+IngresarMonth);
        return Tasks.instrumented(IngresarMonth.class,IngresarMonth);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarMonth).into(InicioDemoPage.MONTH)
        );
    }

}
