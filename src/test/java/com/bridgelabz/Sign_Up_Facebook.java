package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_Up_Facebook {

    public WebDriver webDriver;

    @Test
    public void signUp() throws InterruptedException {
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
    }
}