package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleccionarPlaceOrder implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleccionarPlaceOrder.class);
    private final String SeleccionarPlaceOrder;


    public SeleccionarPlaceOrder(String SeleccionarPlaceOrder){

        this.SeleccionarPlaceOrder = SeleccionarPlaceOrder;
    }
    public static Performable withSeleccionarPlaceOrder(){
        LOGGER.info("selecciona PlaceOrder: ");
        return Tasks.instrumented(SeleccionarPlaceOrder.class,"");

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioDemoPage.PLACEORDER)
        );

    }

}
