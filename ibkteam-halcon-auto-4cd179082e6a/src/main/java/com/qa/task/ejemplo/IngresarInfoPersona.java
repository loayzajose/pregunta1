package com.qa.task.ejemplo;

import com.qa.userInterface.ejemplo.ShoppingProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarInfoPersona implements Task{

        private final String firstName;
        private final String lastName;
        private final String postalCode;

        public IngresarInfoPersona(String firstName, String lastName, String postalCode) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.postalCode = postalCode;
        }

        public static Performable withData(String firstName, String lastName, String postalCode){
          return Tasks.instrumented(IngresarInfoPersona.class,firstName,lastName,postalCode);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(firstName).into(ShoppingProductPage.FIRSTNAME),
                    Enter.theValue(lastName).into(ShoppingProductPage.LASTNAME),
                    Enter.theValue(postalCode).into(ShoppingProductPage.POSTALCODE),
                    Click.on(ShoppingProductPage.BTN_CONTINUE)
            );
        }

}
