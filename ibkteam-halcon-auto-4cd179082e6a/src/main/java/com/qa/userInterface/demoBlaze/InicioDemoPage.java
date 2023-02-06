package com.qa.userInterface.demoBlaze;

import com.qa.generic.BasePage;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioDemoPage extends BasePage {



    public static final Target SIGNUP=Target.the("sigunup").located(By.id("signin2"));

    public static final Target USERNAME=Target.the("user name").located(By.id("sign-username"));
    public static final Target PASSWORD=Target.the("password").located(By.id("sign-password"));

    public static final Target SIGNUPFIN=Target.the("botonsignup").located(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]"));

    public static final Target BOTON_CLOSE=Target.the("botonclose").located(By.xpath("//*[@id='signInModal'']/div/div/div[3]/button[1]"));


    public static final Target BOTON_LOGIN=Target.the("botonsignup").located(By.xpath("//*[@id='login2']"));


    public static final Target USERNAMEL=Target.the("user name").located(By.id("loginusername"));
    public static final Target PASSWORDL=Target.the("password").located(By.id("loginpassword"));


    public static final Target BOTON_LOGINN=Target.the("botonsignup").located(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]"));


    public static final Target BOTON_CARD=Target.the("addcard").located(By.xpath("//a[text()='Cart']"));

    public static final Target PLACEORDER=Target.the("placeorder").located(By.xpath("//*[@id='page-wrapper']/div/div[2]/button"));

    public static final Target NAME=Target.the("user name").located(By.id("name"));
    public static final Target COUNTRY=Target.the("user name").located(By.id("country"));
    public static final Target CITY=Target.the("user name").located(By.id("city"));
    public static final Target CREDITCARD=Target.the("user name").located(By.id("card"));
    public static final Target MONTH=Target.the("user name").located(By.id("month"));
    public static final Target YEAR=Target.the("user name").located(By.id("year"));

    public static final Target BOTON_PURCHASE=Target.the("placeorder").located(By.xpath("//*[@id='page-wrapper']/div/div[2]/button"));

}
