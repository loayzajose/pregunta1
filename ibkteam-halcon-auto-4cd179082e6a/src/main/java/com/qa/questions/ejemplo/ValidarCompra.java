package com.qa.questions.ejemplo;

import com.qa.userInterface.ejemplo.ShoppingProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCompra implements Question<String> {

    public static ValidarCompra getMessage(){
        return new ValidarCompra();
    }
    @Override
    public String answeredBy(Actor actor) {
        return ShoppingProductPage.SUCESS_MESSAGE.resolveFor(actor).getText();
    }
}
