package com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.falabella.ui.CartUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductValidationQtyQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String qty=actor.recall("qty");
        WaitUntil.the(TXT_QTY, isVisible()).forNoMoreThan(10).seconds();
        return qty.equals(TXT_QTY.resolveFor(actor).getAttribute("value"));
    }

    public static Question<Boolean> from(){
        return new ProductValidationQtyQuestion();
    }
}
