package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;
    LoginScreen loginScreen;
    @Step("Ingresar correo {0}")
    public void usuario(String usuario){
        searchScreen.clickSearchInput1();
        searchDetailsScreen.enterSearchInput1(usuario);
    }

    @Step("Ingresar contraseña {0}")
    public void contraseña(String contraseña){
        searchScreen.clickSearchInput2();
        searchDetailsScreen.enterSearchInput2(contraseña);
    }
    @Step("Obtiene el titulo {0}")
    public String titulo(){
        return searchScreen.getResultText();
    }
    @Step("Obtiene el item {0}")
    public String titulo2(){
        return searchScreen.getResultText();
    }

    @Step("Click en Login")
    public void clickLogin(){
        loginScreen.clickLogin();
    }
}
