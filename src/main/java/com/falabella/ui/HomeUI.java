package com.falabella.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static Target TXT_SEARCH=Target.the("Textbox search")
    .located(By.id("testId-SearchBar-Input"));

    public static Target BUTTON_CLOSE =Target.the("No Button")
    .located(By.cssSelector(".airship-btn-deny")) ;
}
