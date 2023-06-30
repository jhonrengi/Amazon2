package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CatalogoUI {

    public static final Target LBL_NAME_PRODUCT = Target.the("products collection")
            .locatedBy("//h2/a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal' and not(@is-empty)]");
}
