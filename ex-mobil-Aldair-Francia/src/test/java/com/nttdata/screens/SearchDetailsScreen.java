package com.nttdata.screens;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
public class SearchDetailsScreen {
    @AndroidFindBy(id="test-Username")
    private WebElement searchDetailInput1;

    @AndroidFindBy(id="test-Username")
    private WebElement searchDetailInputText1;

    @AndroidFindBy(id="test-Password")
    private WebElement searchDetailInput2;

    @AndroidFindBy(id="test-Password")
    private WebElement searchDetailInputText2;

    public void enterSearchInput1(String usuario){
        searchDetailInput1.click();
        searchDetailInputText1.sendKeys(usuario);
    }

    public void enterSearchInput2(String contraseña){
        searchDetailInput2.click();
        searchDetailInputText2.sendKeys(contraseña);
    }


}
