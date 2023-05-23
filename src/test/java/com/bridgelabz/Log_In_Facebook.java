package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log_In_Facebook {

    public WebDriver webDriver;

    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();

        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement elementUN = webDriver.findElement(By.id("email"));
        elementUN.sendKeys("hansaniddeshmukh435@gmail.com");

        WebElement elementPass = webDriver.findElement(By.name("pass"));
        elementPass.sendKeys("hansani976stdpe$@#");

        WebElement elementLogin = webDriver.findElement(By.name("login"));
        elementLogin.click();
    }
}