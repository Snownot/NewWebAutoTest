package com.EasiShare.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://192.168.31.105/onp/_web/")
public class DictionaryPage extends PageObject {

    @FindBy(name = "Username")
    private WebElementFacade searchName;

    @FindBy(name = "Password")
    private WebElementFacade searchLogin;

    @FindBy(id = "loginSubmit")
    private WebElementFacade searchLoginButton;

    public void enterKeywords(String key, String keyword) {

    }


    public void clickButton(String keyword) {

    }


    private WebElementFacade getSearchElement(String findName) {
        switch (findName) {
            case ("login"):
                return searchName;
            case ("password"):
                return searchLogin;
            case ("button"):
                return searchLoginButton;
            default:
                return null;
        }
    }
}