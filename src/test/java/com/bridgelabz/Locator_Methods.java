package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locator_Methods {

    public WebDriver webDriver;

    @Test
    public void locatorMethods() {

        //id() name()
        WebElement elementUN = webDriver.findElement(By.id("email"));
        elementUN.sendKeys("hansaniddeshmukh435@gmail.com");

        WebElement elementPass = webDriver.findElement(By.name("pass"));
        elementPass.sendKeys("hansani976stdpe$@#");

        WebElement elementLogin = webDriver.findElement(By.name("login"));
        elementLogin.click();

        //linkText
        WebElement linkText1 = webDriver.findElement(By.linkText("Create new account"));
        linkText1.click();

        //partialLinkText
        WebElement partialLinkText1 = webDriver.findElement(By.partialLinkText("Create new"));
        partialLinkText1.click();

        //cssSelector - 4 attributes - id,type,class,value
        WebElement cssSelector1 = webDriver.findElement(By.cssSelector("input[id='u_9_b_Ep']"));
        cssSelector1.sendKeys("hansani");

        //xPath
        WebElement xPath1 = webDriver.findElement(By.xpath("//input[@name='lastname']"));
        xPath1.sendKeys("deshmukh");

        //text()
        WebElement textXPath = webDriver.findElement(By.xpath("//button[text()='Log in']"));
        textXPath.click();

        //contain()
        WebElement containXPath = webDriver.findElement(By.xpath("//button[contains(text(),'Log')]"));
        containXPath.click();

        //contain()
        WebElement containXPath1 = webDriver.findElement(By.xpath("//button[contains(@name,'login')]"));
        containXPath1.click();
    }
}