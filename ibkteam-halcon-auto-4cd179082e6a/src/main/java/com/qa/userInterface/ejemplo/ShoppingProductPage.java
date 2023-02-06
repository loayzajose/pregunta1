package com.qa.userInterface.ejemplo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingProductPage extends PageObject {
    public static final Target PRODUCT_NAME=Target.the("nombre del producto").located(By.id("item_4_title_link"));
    public static final Target ADD_CART=Target.the("nombre del producto").located(By.id("cartur"));
    public static final Target SHOPPING_CART=Target.the("nombre del producto").located(By.id("shopping_cart_container"));
    public static final Target PRODUCT_ITEM=Target.the("nombre del producto").located(By.xpath("//div[@class='inventory_item_name']"));
    public static final Target BTN_CHECKOUT=Target.the("nombre del producto").located(By.id("checkout"));
    public static final Target FIRSTNAME=Target.the("nombre del producto").located(By.name("firstName"));
    public static final Target LASTNAME=Target.the("nombre del producto").located(By.name("lastName"));
    public static final Target POSTALCODE=Target.the("nombre del producto").located(By.name("postalCode"));
    public static final Target BTN_CONTINUE=Target.the("nombre del producto").located(By.id("continue"));
    public static final Target BTN_FINISH=Target.the("nombre del producto").located(By.id("finish"));
    public static final Target SUCESS_MESSAGE=Target.the("nombre del producto").located(By.xpath("//div[@id='checkout_complete_container']/h2"));

    public static final Target LIST_PRODUCTS=Target.the("nombre del producto").located(By.xpath("//div[@class='inventory_item_name']"));



}
