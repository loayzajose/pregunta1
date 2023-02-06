package com.qa.stepDefinitions.ejemplo;

import com.qa.generic.BasePage;
import com.qa.questions.ejemplo.ValidarHome;
import com.qa.task.ejemplo.Login;
import com.qa.task.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;

public class LoginStepDef {
    @Steps
    BasePage page;
    @Given("{actor} abre la aplicación sauce")
    public void abrrir_el_aplicativo(Actor actor){
        actor.wasAbleTo(NavigateTo.DemoPage("https://www.saucedemo.com/"));
    }

    @And("El ingresa su userName {string}")
    public void elIngresaSuUserName(String username) {

    }

    @And("EL ingresa su password {string}")
    public void elIngresaSuPassword(String password) {

    }

    @When("El presiona click en el login button")
    public void elPresionaClickEnElLoginButton() {

    }

    @Then("El puede ver home del aplicativo {string}")
    public void elPuedeVerHomeDelAplicativo(String home) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarHome.getTexto(), equalTo(home)));

    }


    @When("El usuario realiza login con credenciales {string} {string}")
    public void elUsuarioRealizaLoginConCredenciales(String user, String password) {
        theActorInTheSpotlight().attemptsTo(Login.withCredentials(user,password));
    }

}
