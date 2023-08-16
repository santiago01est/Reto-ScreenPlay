package com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.falabella.ui.HomeUI.BUTTON_CLOSE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickCloseDialog implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(BUTTON_CLOSE, isVisible()).forNoMoreThan(20).seconds();
        BUTTON_CLOSE.resolveFor(actor).click();
    }

    public static Performable click() {
        return instrumented(ClickCloseDialog.class);
    }
}
