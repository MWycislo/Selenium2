package org.example.testCase;

import org.example.pages.DashboardPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.Driver", "D:\\Dokumenty\\SDA - Tester Oprogramowania\\Repozytoria\\Selenium\\chromedriver\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();

        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

        homepage.loginClick();

        loginpage.enterUserName("gunjankaushik");
        loginpage.enterPassword("Password@123");
        loginpage.clickLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dashboardPage.isCurrentUserCorrect("gunjankaushik");
    }
}