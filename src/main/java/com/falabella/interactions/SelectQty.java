package com.falabella.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import com.falabella.utils.Data;
import static com.falabella.ui.ProductDetails.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Random;

public class SelectQty implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        //int qty= Integer.parseInt( Data.extractTo().get(0).get("Qty"));

        // ciclo para dar click al boton cantidades (Random)
        Random random = new Random();
        int qtyrandom= random.nextInt(3 - 1 + 1) + 1;
        for (int i = 0; i < (qtyrandom-1); i++) {
            BUTTON_QTY.resolveFor(actor).click();
        }

        WebElementFacade nameProduct = LBL_NAME_PRODUCT.resolveFor(actor);
        actor.remember("qty", TXT_QTY.resolveFor(actor).getAttribute("value"));
        actor.remember("name", nameProduct.getText().toString());
    }

    public static Performable clickQty(){
        return instrumented(SelectQty.class);
    }

}
