package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    SoftAssert soft = new SoftAssert();
    P03_homePage search = new P03_homePage();

    @Given("user clicks on search bar")
    public void click_search(){
        search.search_field().click();
    }
    @When("user enter productname as {string}")
    public void enter_productname(String productname){
        search.search_field().sendKeys(productname);
        search.search_field().sendKeys(Keys.ENTER);
    }
    @Then("user succseefuly gets the products {string}")
    public void search_result(String productname) {
        System.out.println(productname);
        String actualUrl = Hooks.driver.getCurrentUrl();
        System.out.println(actualUrl);
        soft.assertTrue(actualUrl.contains("https://demo.nopcommerce.com/search?q"));
        int count = search.result_count().size();
        System.out.println("Displayed items : "+ count);
        for (int i = 0; i< count; i++){
            String itemText = search.result_count().get(i).getText();
            System.out.println((itemText));
            soft.assertTrue(itemText.toLowerCase().contains(productname));
        }
        soft.assertAll();
    }
    @When("user enter sku {string} and click enter")
    public  void userentersku(String sku){
        search.search_field().sendKeys(sku);
        search.search_field().sendKeys(Keys.ENTER);
    }
    @And("user click on product from search result")
    public void clickonproduct(){
        search.result_count().get(0).click();
    }
    @Then("used {string} shown in the product page")
        public  void shwoproduct(String sku){
            String actualskutext= search. sku_item().getText();
            String expectdsku = "SKU: "+sku;
            System.out.println(("actual "+ actualskutext));
            System.out.println("expected "+expectdsku);
            soft.assertEquals(actualskutext,expectdsku);
            soft.assertAll();

        }
    }

