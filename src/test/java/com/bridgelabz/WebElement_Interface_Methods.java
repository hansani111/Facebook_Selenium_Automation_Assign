package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Interface_Methods {

    public WebDriver webDriver;

    @Test
    public void driverLaunch() throws InterruptedException {
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
        System.out.println(" text is : "+text);

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