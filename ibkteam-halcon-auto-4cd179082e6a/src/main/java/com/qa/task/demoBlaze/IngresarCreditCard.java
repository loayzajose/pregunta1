package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IngresarCreditCard implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(IngresarCreditCard.class);
    private final String IngresarCreditCard;


    public IngresarCreditCard(String IngresarCreditCard){

        this.IngresarCreditCard = IngresarCreditCard;
    }
    public static Performable withCreditCard(String IngresarCreditCard){
        LOGGER.info("ingresar creditcard:"+IngresarCreditCard);
        return Tasks.instrumented(IngresarCreditCard.class,IngresarCreditCard);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(IngresarCreditCard).into(InicioDemoPage.CREDITCARD)
        );
    }

}
