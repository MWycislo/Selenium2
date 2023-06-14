package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath="//*[@id=\"userName-value\"]")
    WebElement currentUser;

    public boolean isCurrentUserCorrect(String user) {
        String textCurrentUser = currentUser.toString();
        if (user.equals(textCurrentUser)) {
            System.out.println("Prawidłowy User: " + currentUser);
            return true;
        }
    else {
            System.out.println("Błędny User: " + currentUser);
            return false;
        }
    }
}
