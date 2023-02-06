package com.qa.generic;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CartBasePage extends PageObject {
    private static final Logger logger = LoggerFactory.getLogger(CartBasePage.class);

    private  EnvironmentVariables environmentVariables;

    @Step("obtener el ambiente")
    public  String getEnvironment(){
        String ambiente =  EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("cartwebdriver.base.url");
        return ambiente;

    }


}
