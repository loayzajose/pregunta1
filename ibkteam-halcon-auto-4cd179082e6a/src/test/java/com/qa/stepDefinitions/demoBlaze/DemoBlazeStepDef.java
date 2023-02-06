package com.qa.stepDefinitions.demoBlaze;


import com.qa.generic.BasePage;
import com.qa.generic.CartBasePage;
import com.qa.task.NavigateTo;
import com.qa.task.demoBlaze.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class DemoBlazeStepDef {

    @Steps
    BasePage page;
    CartBasePage pagec;
    @Given("El {actor} abre la página de DemoBlaze")
    public void el_usuario_abre_la_pagina_de_DemoBlaze(Actor actor) {
        actor.wasAbleTo(NavigateTo.DemoPage(page.getEnvironment()));
    }


    @And("El usuario ingresa datos Signup")
    public void elUsuarioIngresaDatosSignup() {
       // theActorInTheSpotlight().attemptsTo(IngresarDocumentoCS.withDocumentNumber(table.cell(1,0)));
        // theActorInTheSpotlight().attemptsTo(IngresarEmailCS.withEmail(table.cell(1,1)));
     //   theActorInTheSpotlight().attemptsTo(IngresarOperadorCS.withOperator(table.cell(1, 2)));
      //  theActorInTheSpotlight().attemptsTo(IngresarCelularCS.withCelular(table.cell(1, 3)));

        theActorInTheSpotlight().attemptsTo(SeleccionarSignUp.withSeleccionarSignUp());


    }

    @And("El usuario ingresa datos Login")
    public void elUsuarioIngresaDatosLogin(DataTable table) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(SeleccionarLogin.withSeleccionarLogin());

        theActorInTheSpotlight().attemptsTo(IngresarUsernameL.withUsernameL(table.cell(1,0)));
        theActorInTheSpotlight().attemptsTo(IngresarPasswordL.withPasswordl(table.cell(1,1)));


        theActorInTheSpotlight().attemptsTo(SeleccionarLoginn.withSeleccionarLoginn());

        //NavigateTo.CardDemoPage(pagec.getEnvironment());
    }

    @Given("se agrega producto al carro de compras")
    public void se_agrega_producto_al_carro_de_compras(DataTable table) {
        // Write code here that turns the phrase above into concrete actions

        theActorInTheSpotlight().attemptsTo(AgregarProducto.withAgregarProducto());
        theActorInTheSpotlight().attemptsTo(SeleccionarPlaceOrder.withSeleccionarPlaceOrder());

        theActorInTheSpotlight().attemptsTo(IngresarName.withName(table.cell(1,0)));
        theActorInTheSpotlight().attemptsTo(IngresarCountry.withCountry(table.cell(1,1)));
        theActorInTheSpotlight().attemptsTo(IngresarCity.withCity(table.cell(1,2)));
        theActorInTheSpotlight().attemptsTo(IngresarCreditCard.withCreditCard(table.cell(1,3)));
        theActorInTheSpotlight().attemptsTo(IngresarMonth.withMonth(table.cell(1,4)));
        theActorInTheSpotlight().attemptsTo(IngresarYear.withYear(table.cell(1,5)));

        theActorInTheSpotlight().attemptsTo(SeleccionarPurchase.withSeleccionarPurchase());

        throw new io.cucumber.java.PendingException();
    }


    @And("Agrega producto al carrito de compras")
    public void agrega_producto_al_carrito_de_compras() {
        NavigateTo.CardDemoPage(pagec.getEnvironment());
    }
}
