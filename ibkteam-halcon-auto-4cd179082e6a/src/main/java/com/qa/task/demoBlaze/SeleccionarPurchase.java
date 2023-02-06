package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleccionarPurchase implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleccionarPurchase.class);
    private final String SeleccionarPurchase;


    public SeleccionarPurchase(String SeleccionarPurchase){

        this.SeleccionarPurchase = SeleccionarPurchase;
    }
    public static Performable withSeleccionarPurchase(){
        LOGGER.info("selecciona purchase: ");
        return Tasks.instrumented(SeleccionarPurchase.class,"");

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioDemoPage.BOTON_PURCHASE)
        );

    }

}
