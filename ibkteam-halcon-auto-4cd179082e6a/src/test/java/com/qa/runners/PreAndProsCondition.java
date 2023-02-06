package com.qa.runners;

import com.qa.generic.Parameters;
import io.cucumber.java.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.exceptions.ScreenShot;

public class PreAndProsCondition extends PageObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(PreAndProsCondition.class);
    String screenShot= Parameters.RutaEvidencia;
    @Before()
    public void beforeScenario(Scenario scenario){
        LOGGER.info("Running:"+scenario.getName());
        OnStage.setTheStage(new OnlineCast());
        LOGGER.info("create folder for screenshot");
        screenShot+=scenario.getName();
        Parameters.RutaEvidenciaActual=screenShot;
        ScreenShot.createFolder(screenShot);

    }

    @After()
    public void afterScenario(Scenario scenario){
        //realizar alguna acción al finalizar el scenario
        LOGGER.info("finishing:"+scenario.getName());

    }
    @BeforeStep
    public void beforeStep() {


    }

    @AfterStep
    public void afterStep(){
        //ScreenShot.captureScreenshot(getDriver(),screenShot);


    }


}
