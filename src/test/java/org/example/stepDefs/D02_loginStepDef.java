package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

public class D02_loginStepDef {
    SoftAssert soft = new SoftAssert();

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void loginPage() {
        login.registerlink().click();

    }

    @When("login with {string} and {string}")
    public void pass_email(String email, String pass) {
        login.email().sendKeys(email);
        login.pass().sendKeys(pass);
    }
    @And("user press on login button")
    public void LOGINN() {
        login.LOGIN().click();
    }

    @Then("success message is displayed LOGIN")
    public void success_message_login() {
        System.out.println("URL: " + Hooks.driver.getCurrentUrl());
        Hooks.driver.getCurrentUrl();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/register?returnurl=%2F");
        soft.assertTrue(login.success_msg_login().isDisplayed(),"my account");
        soft.assertAll();
    }
    @When("user login with invalid {string} and {string}")

    public void userloginwithinvalid(String email, String password){
        login.email().sendKeys(email);
        login.pass().sendKeys(password);

    }
    @Then("user could not login to the system")
    public void usercantlogin(){
        String unsuccessfulmsg= login.invalidlogin().getText();
        String unsuccessfulmsgcolor= login.invalidlogin().getCssValue("color");
        String Hexaunsuccessfulmsgcolor=Color.fromString(unsuccessfulmsgcolor).asHex();
        System.out.println(unsuccessfulmsg);
        System.out.println(Hexaunsuccessfulmsgcolor);
        soft.assertTrue(unsuccessfulmsg.contains("Login was unsuccessful"));
        soft.assertEquals(Hexaunsuccessfulmsgcolor,"#e4434b");
        soft.assertAll();

    }
}