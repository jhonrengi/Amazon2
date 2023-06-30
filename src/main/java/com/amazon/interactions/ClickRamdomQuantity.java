package com.amazon.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;


import static com.amazon.ui.ProductUI.CBX_QUANTITIES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRamdomQuantity implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = CBX_QUANTITIES.resolveAllFor(actor);

        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());

        String productName = listProducts.get(indexRandom).getText();

        listProducts.get(indexRandom).click();
    }

    public static Performable click(){
        return  instrumented(ClickRamdomQuantity.class);
    }
}
