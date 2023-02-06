package com.qa.stepDefinitions.ejemplo;

import com.qa.questions.ejemplo.ValidarCompra;
import com.qa.task.ejemplo.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class ShoppingProductStepDef {

    @Given("El usuario selecciona producto {string}")
    public void el_usuario_selecciona_producto(String productName) {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.withProductName(productName));

    }

   @And("El usuario agrega producto al carito")
    public void el_usuario_agrega_producto_al_carito() {
       // theActorInTheSpotlight().attemptsTo(AgregarProducto.withButton()) ;
    }


    @Given("El usuario selecciona pagar")
    public void el_usuario_selecciona_pagar() {
        theActorInTheSpotlight().attemptsTo(PagarProducto.withButtonPay());
    }

    @Given("El usuario ingresa datos personales")
    public void el_usuario_ingresa_datos_personales(DataTable data) {
        String firstName = data.cell(1,0);
        String lastName = data.cell(1,1);
        String postalCode = data.cell(1,2);

        theActorInTheSpotlight().attemptsTo(
                IngresarInfoPersona.withData(firstName,lastName,postalCode)
        );

    }

    @When("El usuario selecciona finalizar compra")
    public void el_usuario_selecciona_finalizar_compra() {
        theActorInTheSpotlight().attemptsTo(SeleccionarFinalizarCompra.withButton());
    }

    @Then("El usuario puede ver la confirmación de compra {string}")
    public void el_usuario_puede_ver_la_confirmación_de_compra(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCompra.getMessage(), equalTo(message)));
    }

}
