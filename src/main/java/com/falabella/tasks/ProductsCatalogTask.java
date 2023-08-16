package com.falabella.tasks;
import com.falabella.interactions.ClickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductsCatalogTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickRandom.click()
        );

    }

    public static ProductsCatalogTask on(){
        return instrumented(ProductsCatalogTask.class);
    }
}
