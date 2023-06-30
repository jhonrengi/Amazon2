package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductUI {

    public static final Target LBL_PRODUCTS = Target.the("Search Product")
            .located(By.id("productTitle"));

    public static final Target BTN_QUANTITY = Target.the("Quantity Product")
            .located(By.id("//*[@id='a-autoid-0-announce']"));



    //ul[@class='a-nostyle a-list-link']

    public static final Target CBX_QUANTITIES = Target.the("Combo box quantities")
            .located(By.xpath("//select[@id='quantity']/option"));

}
