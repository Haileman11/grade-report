package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        generateGradeReport();
    }
    public static void generateGradeReport(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.navigate().to("http://portal.aait.edu.et/");
        WebElement idBox=webDriver.findElement(By.id("UserName"));
        idBox.sendKeys("atr/3988/08");
        WebElement passBox= webDriver.findElement(By.id("Password"));
        passBox.sendKeys("0937930659");
        WebElement loginButton=webDriver.findElement(By.cssSelector(".btn-success"));
        loginButton.click();
        webDriver.navigate().to("http://portal.aait.edu.et/Grade/GradeReport");
        List<WebElement> x = webDriver.findElements(By.className("yrsm"));
        for (WebElement i : x ){
            String string=i.findElement(By.tagName("td")).findElement(By.tagName("p")).getText();
            System.out.println(string);
        }


    }
    public static void checkNotification(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.navigate().to("https://www.facebook.com/");

        WebElement input=webDriver.findElement(By.id("email"));
        input.sendKeys("");



        WebElement password=webDriver.findElement(By.id("pass"));
        password.sendKeys("");

        WebElement login=webDriver.findElement(By.id("u_0_2"));
        login.click();

        //WebElement notification=webDriver.findElement(By.)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //webDriver.close();
    }
}
