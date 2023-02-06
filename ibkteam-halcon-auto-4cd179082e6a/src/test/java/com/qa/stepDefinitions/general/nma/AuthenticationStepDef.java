package com.qa.stepDefinitions.general.nma;


import com.qa.task.demoBlaze.IngresarPassword;
import com.qa.task.demoBlaze.IngresarUsername;
import com.qa.task.demoBlaze.SeleccionarSignUpFin;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AuthenticationStepDef {

    @Given("El usuario se da de alta")
    public void el_usuario_se_da_de_alta(DataTable table) throws Throwable {

         theActorInTheSpotlight().attemptsTo(IngresarUsername.withUsername(table.cell(1,0)));
         theActorInTheSpotlight().attemptsTo(IngresarPassword.withPassword(table.cell(1,1)));

          theActorInTheSpotlight().attemptsTo(SeleccionarSignUpFin.withSeleccionarSignUpFin());

    }

}
