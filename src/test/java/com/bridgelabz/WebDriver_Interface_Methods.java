package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriver_Interface_Methods {

    public WebDriver webDriver;

    @Test
    public void webDriverMethods() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");

        String title = webDriver.getTitle();
        System.out.println("\n" + "Title : " + title + "\n");
        Thread.sleep(4000);

        String sourceCode = webDriver.getPageSource();
        System.out.println("source code : " + sourceCode + "\n");
        Thread.sleep(4000);

        String currentUrl = webDriver.getCurrentUrl();
        System.out.println("current url : " + currentUrl + "\n");

        String windowHandle = webDriver.getWindowHandle();
        System.out.println("current url : " + windowHandle + "\n");

        webDriver.manage().window().maximize();

        webDriver.navigate().to("https://www.flipkart.com/");
        webDriver.navigate().forward();
        webDriver.navigate().back();
        webDriver.navigate().refresh();

        //webDriver.switchTo().window("https://www.instagram.com/");

        webDriver.quit();
        //webDriver.close();
    }
}