package org.example.testCase;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.Driver", "\"C:\\Users\\user\\Desktop\\repozytoria\\Selenium\\chromedriver\\chromedriver.exe\"");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();

        HomePage homepage = new HomePage(driver);
        LoginPage loginpage = new LoginPage(driver);


        homepage.loginClick();
        loginpage.enterUserName("gunjankaushik");
        loginpage.enterPassword("Password@123");
    }
}

