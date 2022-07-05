package com.nttdata.stepsdefinitions;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
public class LoginStepsDef {

    @Steps
    LoginSteps loginSteps;


    @When("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales(String usuario, String contraseña) {
        loginSteps.usuario(usuario);
        loginSteps.contraseña(contraseña);
        loginSteps.clickLogin();
    }
    @Then("valido que debería aparecer el título de {string}")
    public void validar(String validar) {
        Assert.assertEquals(loginSteps.titulo(), validar);
    }

}
