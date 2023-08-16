package com.falabella.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import com.falabella.questions.ProductValidationNameQuestion;
import com.falabella.questions.ProductValidationQtyQuestion;
import com.falabella.tasks.HomeTask;
import com.falabella.tasks.ProductDetailsTask;
import com.falabella.tasks.ProductsCatalogTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddProductToCartStepDef {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("that user open page Falabela and search any product")
    public void thatUserOpenPageFalabelaAndSearchAnyProduct() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.falabella.com/"),
                HomeTask.on());
    }

    @When("user click  on  a product")
    public void userClickOnAProduct() {
        theActorInTheSpotlight().attemptsTo(

                ProductsCatalogTask.on()

        );
    }

    @When("user selects quantity, adds and goes to cart")
    public void userSelectsQuantityAddsAndGoesToCart() {
        theActorInTheSpotlight().attemptsTo(

                ProductDetailsTask.on());
    }

    @Then("user can read the product name and quantity chosen")
    public void userCanReadTheProductNameAndQuantityChosen() {
        theActorInTheSpotlight().should(

                seeThat(
                        ProductValidationQtyQuestion.from(), Matchers.equalTo(true)
                ),
                seeThat(ProductValidationNameQuestion.from(), Matchers.equalTo(true))

        );
    }

}