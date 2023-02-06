package com.qa.questions.ejemplo;

import com.qa.userInterface.ejemplo.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarHome implements Question<String> {

    public static ValidarHome getTexto(){
        return new ValidarHome();
    }
    @Override
    public String answeredBy(Actor actor) {

        if (LoginPage.HOME.resolveFor(actor).isPresent()){
            return LoginPage.HOME.resolveFor(actor).getText();
        }
        else{
            return "";
        }

    }
}
