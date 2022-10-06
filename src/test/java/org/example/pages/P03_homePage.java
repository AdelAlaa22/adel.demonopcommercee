package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement currency_list() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> price_currency() {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"prices\"]"));

    }

    public WebElement search_field() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public List<WebElement> result_count() {
        return Hooks.driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
    }

    public WebElement sku_item() {
        return Hooks.driver.findElement(By.className("SKU"));
    }

    public List<WebElement> topCategories() {
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }

    public List<WebElement> subCategories(int randomSubNum) {
        randomSubNum = randomSubNum + 1;
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[" + randomSubNum + "]/ul[@class=\"sublist first-level\"]/li"));

    }

    public WebElement subPageTitle() {

        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

    public WebElement ft_Slider_Btn_Elm() {
        return Hooks.driver.findElement(By.xpath("//a[@rel=\"0\"]"));
    }

    public WebElement ft_SliderElm() {
        return Hooks.driver.findElement(By.xpath("(//a[@class=\"nivo-imageLink\"])[1]"));
    }

    public WebElement sec_Slider_Btn_Elm() {
        return Hooks.driver.findElement(By.xpath("//a[@rel=\"1\"]"));
    }

    public WebElement sec_SliderElm() {

        return Hooks.driver.findElement(By.xpath("(//a[@class=\"nivo-imageLink\"])[2]"));
    }

    public WebElement facebookElm() {
        return Hooks.driver.findElement(By.className("facebook"));
    }

    public WebElement twitterElm() {
        return Hooks.driver.findElement(By.className("twitter"));
    }

    public WebElement RssElm() {
        return Hooks.driver.findElement(By.className("rss"));
    }

    public WebElement youtubeElm() {
        return Hooks.driver.findElement(By.className("youtube"));

    }

    public WebElement featured_product() {
        return Hooks.driver.findElement(By.xpath(" (//button[@title=\"Add to wishlist\"])[3]"));

    }
    public WebElement success_wishlist_msg (){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]"));

    }
    public WebElement wishlist_tab (){
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }
    public WebElement wishlist_Qty (){
        return Hooks.driver.findElement(By.className("qty-input"));
    }

}

