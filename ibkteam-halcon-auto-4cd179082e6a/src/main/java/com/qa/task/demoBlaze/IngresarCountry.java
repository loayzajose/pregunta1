package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarCountry implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarCountry.class);
    private final String IngresarCountry;


    public IngresarCountry(String IngresarCountry){

        this.IngresarCountry = IngresarCountry;
    }
    public static Performable withCountry (String IngresarCountry){
        LOGGER.info("ingresar city:"+IngresarCountry);
        return Tasks.instrumented(IngresarCountry.class,IngresarCountry);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarCountry).into(InicioDemoPage.COUNTRY)
        );
    }

}
