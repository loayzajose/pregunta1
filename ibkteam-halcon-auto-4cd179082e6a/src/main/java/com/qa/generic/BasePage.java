package com.qa.generic;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasePage extends PageObject {
    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    private  EnvironmentVariables environmentVariables;

    @Step("obtener el ambiente")
    public  String getEnvironment(){
        String ambiente =  EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
        return ambiente;

    }


}
