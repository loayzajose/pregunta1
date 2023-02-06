package com.qa.task.demoBlaze;


import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleccionarLoginn implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleccionarLoginn.class);
    private final String SeleccionarLoginn;


    public SeleccionarLoginn(String SeleccionarLoginn){

        this.SeleccionarLoginn = SeleccionarLoginn;
    }
    public static Performable withSeleccionarLoginn(){
        LOGGER.info("selecciona Loginn: ");
        return Tasks.instrumented(SeleccionarLoginn.class,"");

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioDemoPage.BOTON_LOGINN)
        );

    }

}
