package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
    By loginButton = By.id("login");

    public void loginClick() {
        driver.findElement(loginButton).click();

    }

}
