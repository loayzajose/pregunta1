package com.qa.task.demoBlaze;

import com.qa.userInterface.demoBlaze.InicioDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClickBotonSignClose implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(ClickBotonSignClose.class);
    private final String ClickBotonSignClose;


    public ClickBotonSignClose(String ClickBotonSignClose){

        this.ClickBotonSignClose = ClickBotonSignClose;
    }
    public static Performable withClickBotonSignClose(){
        LOGGER.info("click boton Close:");
        return Tasks.instrumented(ClickBotonSignClose.class,"");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioDemoPage.BOTON_CLOSE)
        );
    }





}
