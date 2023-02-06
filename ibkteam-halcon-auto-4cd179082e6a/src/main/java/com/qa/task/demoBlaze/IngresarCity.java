package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarCity implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarCity.class);
    private final String IngresarCity;


    public IngresarCity(String IngresarCity){

        this.IngresarCity = IngresarCity;
    }
    public static Performable withCity(String IngresarCity){
        LOGGER.info("ingresar city:"+IngresarCity);
        return Tasks.instrumented(IngresarCity.class,IngresarCity);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarCity).into(InicioDemoPage.CITY)
        );
    }

}
