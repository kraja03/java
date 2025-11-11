package com.sparta.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com/cart.html")

public class CartPage extends PageObject {

    @FindBy(className = "shopping_cart_badge")
    private WebElementFacade shoppingCart;

}
