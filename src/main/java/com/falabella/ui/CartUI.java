package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {

    public static Target LBL_NAME_PRODUCT=Target.the("Product title in cart")
        .locatedBy("//a[starts-with(@class, 'chakra-link css-qpfo7l')]");

    public static Target TXT_QTY=Target.the("Products quantity in cart")
            .locatedBy("//input[starts-with(@id,'qty')]");

}
