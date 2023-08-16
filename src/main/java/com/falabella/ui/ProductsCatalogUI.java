package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;


public class ProductsCatalogUI {
    public static Target LBL_NAME_PRODUCTS=Target.the("products collection")
            .locatedBy("//img[starts-with(@id,'testId-pod-image')]");

}
