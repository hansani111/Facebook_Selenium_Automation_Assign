package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Interface_Methods {

    public WebDriver webDriver;

    @Test
    public void webElementMethods() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();

        WebElement findEle = webDriver.findElement(By.id("email"));
        findEle.sendKeys("hansaniddeshmukh@gmail.com");
        Thread.sleep(4000);
        findEle.clear();
        Thread.sleep(4000);
        findEle.sendKeys("hansaniddeshmukh435@gmail.com");

        //getAttribute
        String attributeField = findEle.getAttribute("placeholder");
        System.out.println(attributeField);

        //getCssValue
        String cssValue = findEle.getCssValue("font-size");
        System.out.println(cssValue);

        //getLocation
        int xCoOrdinate = findEle.getLocation().x;
        System.out.println(xCoOrdinate);
        int yCoOrdinate = findEle.getLocation().y;
        System.out.println(yCoOrdinate);

        //getSize
        int size = findEle.getSize().getWidth();
        System.out.println(size);
        int width = findEle.getSize().getHeight();
        System.out.println(width);

        //getText
        String text = findEle.getText();
        System.out.println(" text is : " + text);

        //isDisplayed
        boolean displayed = findEle.isDisplayed();
        System.out.println(displayed);

        //isSelected
        boolean selected = findEle.isSelected();
        System.out.println(selected);

        //isEnabled
        boolean enabled = findEle.isEnabled();
        System.out.println(enabled);

        Thread.sleep(4000);
        findEle.clear();

        //sendKeys
        WebElement elementUN = webDriver.findElement(By.id("email"));
        elementUN.sendKeys("hansaniddeshmukh435@gmail.com");

        WebElement elementPass = webDriver.findElement(By.name("pass"));
        elementPass.sendKeys("hansani976stdpe$@#");

        WebElement elementLogin = webDriver.findElement(By.name("login"));
        elementLogin.click();
    }
}