package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage currency = new P03_homePage();
    @Given("user select currency")
    public void currency_list(){
        currency.currency_list().click();
        Select currencyValue = new Select(currency.currency_list());
currencyValue.selectByVisibleText("Euro");
    }
    @Then("The price of items is with euro")
    public void prices_currency(){
        int itesmSize = Hooks.driver.findElements(By.cssSelector("div[class=\"prices\"]")).size();
        System.out.println("Displayed items size: " + itesmSize);
        for (int i =0; i< itesmSize; i++){
            String itemText = Hooks.driver.findElements(By.cssSelector("div[class=\"prices\"]")).get(i).getText();
            System.out.println(itemText);
            Assert.assertTrue(currency.price_currency().get(i).getText().contains("€"),"Euro displayed");
        }
    }


}
