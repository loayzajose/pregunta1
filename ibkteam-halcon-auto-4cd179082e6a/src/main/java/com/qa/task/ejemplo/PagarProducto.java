package com.qa.task.ejemplo;

import com.qa.userInterface.ejemplo.ShoppingProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class PagarProducto implements Task {

    public static Performable withButtonPay(){
        return Tasks.instrumented(PagarProducto.class,"");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingProductPage.SHOPPING_CART)
        );
        if (ShoppingProductPage.PRODUCT_ITEM.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(ShoppingProductPage.BTN_CHECKOUT)
            );
        }
        else {
            System.out.println("carrito de compra vacio");
        }
    }
}
