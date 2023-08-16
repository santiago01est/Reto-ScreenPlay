package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDetails {
        public static Target BUTTON_QTY = Target.the("Product quantity")
                        .located(By.id("quantity-selector-increment-btn"));

        public static Target LBL_NAME_PRODUCT = Target.the("Product title in cart")
        .locatedBy("//h1[contains(@class,'product-name fa--product-name')]");

        public static Target TXT_QTY = Target.the("Text box quantity")
                        .located(By.id("quantity-selector-increment-input"));

        public static Target BUTTON_ADD_CART = Target.the("Add product to cart")
                        .located(By.id("add-to-cart-button"));

        public static Target TXT_GO_CART = Target.the("Go to cart")
                        .located(By.id("linkButton"));

}
