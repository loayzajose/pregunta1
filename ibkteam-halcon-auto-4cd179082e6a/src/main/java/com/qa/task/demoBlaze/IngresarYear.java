package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarYear implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarYear.class);
    private final String IngresarYear;


    public IngresarYear(String IngresarYear){

        this.IngresarYear = IngresarYear;
    }
    public static Performable withYear(String IngresarYear){
        LOGGER.info("ingresar year:"+IngresarYear);
        return Tasks.instrumented(IngresarYear.class,IngresarYear);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarYear).into(InicioDemoPage.YEAR)
        );
    }

}
