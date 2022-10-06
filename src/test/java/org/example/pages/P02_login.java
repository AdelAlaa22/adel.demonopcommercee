package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement registerlink() {
        WebElement reg = Hooks.driver.findElement(By.className("ico-login"));
        return reg;

    }

    public WebElement email() {

        WebElement reg = Hooks.driver.findElement(By.id("Email"));
        return reg;
    }

    public WebElement pass() {

        WebElement reg = Hooks.driver.findElement(By.id("Password"));
        return reg;
    }

    public WebElement LOGIN() {
        WebElement reg = Hooks.driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        return reg;
    }

    public WebElement success_msg_login() {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/customer/info\"]"));
    }
    public WebElement invalidlogin(){
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
    }
}