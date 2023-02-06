package com.qa.task.ejemplo;

import com.qa.userInterface.ejemplo.ShoppingProductPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task {
    private final String productname;

    public SeleccionarProducto(String productname) {
        this.productname = productname;
    }

    public static Performable withProductName(String productname) {
       return Tasks.instrumented(SeleccionarProducto.class,productname);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
      //actor.attemptsTo(Click.on(ShoppingProductPage.PRODUCT_NAME));

        for (WebElementFacade product:ShoppingProductPage.LIST_PRODUCTS.resolveAllFor(actor)) {
            if (productname.equalsIgnoreCase(product.getText())){
                actor.attemptsTo(
                        Click.on(product)
                );
                break;
            }
            else {

            }
        }
    }
}
