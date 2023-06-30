package com.amazon.stepDefinitions;

import com.amazon.tasks.HomeTask;
import com.amazon.tasks.ProducDetailsTask;
import com.amazon.tasks.ProductTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddToCartStepsDefinition {

    @Before
    public void setStage() { setTheStage(new OnlineCast());}
    @Given("that user open page Amazon and search any product")
    public void openUrl() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.amazon.com/")
        );
    }
    @When("user click  on  product tittle and user click on add to cart")
    public void selectProduct() {
        theActorInTheSpotlight().attemptsTo(
                HomeTask.Home(),
                ProductTask.on(),
                ProducDetailsTask.on()


        );
    }
    @Then("user can read the product added to cart and watch amount that product.")
    public void userCanReadTheProductAddedToCartAndWatchAmountThatProduct() {

    }
}
