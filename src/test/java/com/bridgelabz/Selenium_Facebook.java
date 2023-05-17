package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Selenium_Facebook {

    public WebDriver webDriver;

    @BeforeMethod
    public void setUp() {
/*        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();  */

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void Instagram() throws InterruptedException {
        webDriver.get("https://www.instagram.com/");
        webDriver.manage().window().maximize();
        String url = webDriver.getCurrentUrl();
        System.out.println("Print the URL : " + url);
        String title = webDriver.getTitle();
        System.out.println("Print the TITLE : " + title);
        String source = webDriver.getPageSource();
        System.out.println("Print the SourceCode : " + source);
        Thread.sleep(5000);
        webDriver.navigate().to("https://www.facebook.com/");
        webDriver.navigate().back();
        Thread.sleep(5000);
        webDriver.navigate().refresh();
        webDriver.navigate().forward();
        webDriver.get("https://www.google.com/");
        Thread.sleep(5000);
        webDriver.close();
        webDriver.quit();
    }

    @Test
    public void signUp() throws InterruptedException, IOException {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/login/");

        WebElement create = webDriver.findElement(By.linkText("Sign up for Facebook"));
        create.click();

        WebElement firstName = webDriver.findElement(By.name("firstname"));
        firstName.sendKeys("hansani");

        WebElement lastName = webDriver.findElement(By.name("lastname"));
        lastName.sendKeys("deshmukh");

        WebElement emailAddress = webDriver.findElement(By.name("reg_email__"));
        emailAddress.sendKeys("hansani@gmail.com");
        Thread.sleep(5000);
        emailAddress.clear();
        emailAddress.sendKeys("hansani@gmail.com");

        String attribute = emailAddress.getAttribute("name");
        System.out.println(attribute);

        WebElement reenter_email = webDriver.findElement(By.name("reg_email_confirmation__"));
        reenter_email.sendKeys("hansani@gmail.com");

        WebElement newPassword = webDriver.findElement(By.name("reg_passwd__"));
        int passwordX = newPassword.getLocation().x;
        System.out.println(passwordX);
        int passwordY = newPassword.getLocation().y;
        System.out.println(passwordY);
        newPassword.sendKeys("hansani6578");

        WebElement dateDropdown = webDriver.findElement(By.id("day"));
        dateDropdown.sendKeys("9");

        WebElement monthDropdown = webDriver.findElement(By.id("month"));
        monthDropdown.sendKeys("jan");

        WebElement yearDropdown = webDriver.findElement(By.id("year"));
        yearDropdown.sendKeys("2002");

        WebElement gender = webDriver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();

        WebElement signup = webDriver.findElement(By.name("websubmit"));
        signup.click();

        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\HP\\IdeaProjects\\Selenium_Assignment\\ScreenShot" + "fb.png");
        FileHandler.copy(sourceFile, destinationFile);
        webDriver.close();
    }

    @Test
    public void login() throws InterruptedException, IOException {
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement elementUN = webDriver.findElement(By.id("email"));
        elementUN.sendKeys("hansaniddeshmukh435@gmail.com");

        WebElement elementPass = webDriver.findElement(By.name("pass"));
        elementPass.sendKeys("hansani976stdpe$@#");

        WebElement elementLogin = webDriver.findElement(By.name("login"));
        elementLogin.click();

/*      webDriver.findElement(By.id("email")).sendKeys("hansaniddeshmukh435@gmail.com");
        webDriver.findElement(By.name("pass")).sendKeys("hansani976stdpe$@#");
        webDriver.findElement(By.name("login")).click();  */

        WebElement elementUN1 = webDriver.findElement(By.id("email"));
        elementUN1.sendKeys("hansaniddeshmukh435@gmail.com");
        Thread.sleep(5000);
        elementUN1.clear();
        String attribute = elementUN1.getAttribute("placeholder");
        System.out.println(attribute);
        Thread.sleep(5000);
        elementUN1.sendKeys("123hansaniddeshmukh435@gmail.com");

        WebElement elementPass1 = webDriver.findElement(By.name("pass"));
        elementPass1.sendKeys("hansani976stdpe$@#");
        int xVar = elementPass1.getLocation().getX();
        System.out.println("x : " + xVar);
        int yVar = elementPass1.getLocation().getY();
        System.out.println("y : " + yVar);

        //getTagName()
        WebElement linkText = webDriver.findElement(By.linkText("Create new account"));
        //getText()
        String text = linkText.getText();
        System.out.println(text);
        //getDisplayed()
        boolean textDisplay = linkText.isDisplayed();
        System.out.println(textDisplay);
        //isEnabled()
        boolean textEnable = linkText.isEnabled();
        System.out.println(textEnable);
        //isSelected()
        boolean textSelect = linkText.isSelected();
        System.out.println(textSelect);
        //partialLinkText
        webDriver.findElement(By.partialLinkText("create new")).click();
    }

    // Mouse and keyboard operation
    @Test
    public void Robot_Class() throws InterruptedException, AWTException {
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(5000);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(5000);

        //select
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(5000);

        //copy
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(5000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(5000);

        //paste
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(5000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.mouseMove(300, 500);
        robot.mouseWheel(2);
    }
    @Test
    public void webElementLocators() throws InterruptedException {
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(5000);

        //linkText
        WebElement linkText = webDriver.findElement(By.linkText("Create new account"));
        String text = linkText.getText();
        System.out.println(text);

        //partialLinkText
        webDriver.findElement(By.partialLinkText("Create new")).click();

        //cssSelector Locator - support 4 attribute - id,type,class,value
        webDriver.findElement(By.cssSelector("input#email")).sendKeys("7083139170");
        Thread.sleep(5000);
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys("7083139170");
        Thread.sleep(5000);

        //xpath - 2 type - absolute(/) and relative(//)
        webDriver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("7083139170");
        webDriver.findElement(By.xpath("//input[@name='pass']")).sendKeys("hanshu435std");
        WebElement elementLogin1 = webDriver.findElement(By.name("login"));
        elementLogin1.click();

        //text() function
        webDriver.findElement(By.xpath("//button[(text()='Log in']")).click();

        //contain method
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("7083139170");
        webDriver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        //start with()
        webDriver.findElement(By.xpath("//input[starts-with(@placeholder,'Email address')]")).sendKeys("7083139170");

        //ends-with()
        webDriver.findElement(By.xpath("//input[ends-with(@placeholder,'phone number')]")).sendKeys("7083139170");
        webDriver.findElement(By.xpath("//button[ends-with(text(),'Log in')]")).click();
    }
}