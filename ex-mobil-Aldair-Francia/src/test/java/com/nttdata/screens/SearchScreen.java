package com.nttdata.screens;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
public class SearchScreen extends PageObject{
    @AndroidFindBy( xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement searchInput1;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement searchInput2;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement resultText;

    public void clickSearchInput1(){
        searchInput1.click();
    }
    public void clickSearchInput2(){
        searchInput2.click();
    }

    public String getResultText(){
        return resultText.getText();
    }
}
