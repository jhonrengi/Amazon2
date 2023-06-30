package com.amazon.tasks;

import com.amazon.interactions.ClickRamdom;
import com.amazon.interactions.ClickRamdomQuantity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProducDetailsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                ClickRamdomQuantity.click()
        );
    }

    public static Performable on(){
        return instrumented(ProducDetailsTask.class);
    }
}
