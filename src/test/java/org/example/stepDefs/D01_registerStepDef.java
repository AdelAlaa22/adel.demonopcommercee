package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
SoftAssert soft = new SoftAssert();
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void registerpage() {

        register.registerlink().click();
    }

    @When("user select gender type")
    public void gender() {
        register.male().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void first_last_name(String firstname, String lastname) {
        register.firstname().sendKeys(firstname);
        register.lastname().sendKeys(lastname);

    }

    @And("user enter date of birth DAY")

    public void enter_dateofbirthday() {
        Select dayvalue = new Select(register.dateofbirthday());
        dayvalue.selectByValue("1");

    }

    @And("user enter date of birth month")
    public void enter_dateofbirthmonth() {
        Select monthvalue = new Select(register.dateofbirthmonth());
        monthvalue.selectByValue("1");
    }

    @And("user enter date of birth YEAR")
    public void enter_dateofbirthyear() {
        Select yearvalue = new Select(register.dateofbirtyear());
        yearvalue.selectByValue("1998");
    }

    @And("user enter email {string} field")
    public void ENTER_EMAIL(String Email) {

        register.email().sendKeys(Email);
    }

    @And("user fills Password fields {string} {string}")
    public void ENTER_PASSWORD(String Password , String confirmpassword ) {

        register.password().sendKeys(Password);
        register.confirmpassword().sendKeys(confirmpassword);
    }
   @And("user clicks on register button")
    public void REG() {
        register.Register().click();
    }
    @Then("success message is displayed")
    public void success_message(){
        String expectedresult = "Your registration completed";
        String actualresault = register.success_msg().getText();
        String registersuccessmsgcolor = register.success_msg().getCssValue("color");
        String Hexactsuccesscolor= Color.fromString(registersuccessmsgcolor).asHex();
        System.out.println(Hexactsuccesscolor);
        System.out.println("Act result: "+ actualresault);
       soft.assertTrue(actualresault.contains(expectedresult),"Assertion True");
       soft.assertEquals(Hexactsuccesscolor,"#4cb17c");
       soft.assertAll();
    }
}