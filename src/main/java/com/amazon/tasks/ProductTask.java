package com.amazon.tasks;

import com.amazon.interactions.ClickRamdom;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.amazon.ui.ProductUI.*;

public class ProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                ClickRamdom.click()
                /*WaitUntil.the(BTN_QUANTITY, WebElementStateMatchers.isVisible())
                                .forNoMoreThan(10).seconds(),
                Click.on(BTN_QUANTITY)

                 */


        );

    }

    public static Performable on(){
        return instrumented(ProductTask.class);
    }
}
