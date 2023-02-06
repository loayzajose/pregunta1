package com.qa.task.demoBlaze;

import com.qa.userInterface.demoBlaze.InicioDemoPage;
import com.qa.userInterface.ejemplo.ShoppingProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgregarProducto implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProducto.class);
    private final String AgregarProducto;


    public AgregarProducto(String AgregarProducto){

        this.AgregarProducto = AgregarProducto;
    }
    public static Performable withAgregarProducto(){
        LOGGER.info("AgregarProducto: ");
        return Tasks.instrumented(AgregarProducto.class,"");

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioDemoPage.BOTON_CARD)
        );

    }
}
