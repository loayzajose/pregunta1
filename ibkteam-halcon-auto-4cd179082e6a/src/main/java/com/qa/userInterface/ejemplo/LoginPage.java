package com.qa.userInterface.ejemplo;

import com.qa.generic.BasePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public static final Target USER_NAME=Target.the("campo username").located(By.id("user-name"));
    public static final Target PASSWORD=Target.the("campo username").located(By.id("password"));
    public static final Target LOGIN_BUTTON=Target.the("campo username").located(By.name("login-button"));
    public static final Target HOME=Target.the("campo username").located(By.xpath("//div/span[@class='title']"));


}
