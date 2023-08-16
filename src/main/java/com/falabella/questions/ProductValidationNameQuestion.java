package com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.falabella.ui.CartUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.core.pages.WebElementFacade;

public class ProductValidationNameQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade nameProduct = LBL_NAME_PRODUCT.resolveFor(actor);
        String name=actor.recall("name");
        WaitUntil.the(LBL_NAME_PRODUCT, isVisible()).forNoMoreThan(10).seconds();
        return name.contains(nameProduct.getText().toString());
    }

    public static Question<Boolean> from(){
        return new ProductValidationQtyQuestion();
    }
}
