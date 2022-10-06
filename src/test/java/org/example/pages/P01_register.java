package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {


    public WebElement registerlink() {
        WebElement reg = Hooks.driver.findElement(By.className("ico-register"));
        return reg;
    }

    public WebElement male() {
        WebElement reg = Hooks.driver.findElement(By.id("gender-male"));
        return reg;
    }

    public WebElement firstname() {

        WebElement reg = Hooks.driver.findElement(By.id("FirstName"));
        return reg;

    }

    public WebElement lastname() {
        WebElement reg = Hooks.driver.findElement(By.id("LastName"));
        return reg;
    }

    public WebElement dateofbirthday() {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement dateofbirthmonth() {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement dateofbirtyear() {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email() {

        WebElement reg = Hooks.driver.findElement(By.id("Email"));
        return reg;
    }

    public WebElement password() {

        WebElement reg = Hooks.driver.findElement(By.id("Password"));
        return reg;
    }

    public WebElement confirmpassword() {

        WebElement reg = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return reg;
    }

    public WebElement Register() {
        WebElement reg = Hooks.driver.findElement(By.id("register-button"));
        return reg;
    }
    public WebElement success_msg(){
        return Hooks.driver.findElement(By.className("result"));
    }
}

