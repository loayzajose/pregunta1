package com.qa.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {


    public static Performable DemoPage(String url){
        return Task.where("abrir aplicativo de prueba", Open.url(url));
    }

    public static Performable CardDemoPage(String url){
        return Task.where("abrir aplicativo de prueba", Open.url(url));
    }
}
