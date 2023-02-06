package com.qa.task.ejemplo;

import com.qa.userInterface.ejemplo.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.*;

public class Login implements Task {
    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password) {
       return instrumented(Login.class,username,password) ;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Enter.theValue(username).into(LoginPage.USER_NAME),
               Enter.theValue(password).into(LoginPage.PASSWORD),
               Click.on(LoginPage.LOGIN_BUTTON)
       );
    }
}
