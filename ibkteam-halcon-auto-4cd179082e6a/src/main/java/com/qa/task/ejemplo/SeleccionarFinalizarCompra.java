package com.qa.task.ejemplo;

import com.qa.userInterface.ejemplo.ShoppingProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarFinalizarCompra implements Task {
    public static Performable withButton(){
        return Tasks.instrumented(SeleccionarFinalizarCompra.class,"");
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(ShoppingProductPage.BTN_FINISH)
       );
    }
}
