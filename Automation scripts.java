package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.*;
import static org.testng.TestRunner.PriorityWeight.priority;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    WebDriver driver;
    @Test(priority = -1)
    public void launchSite(){
        WebDriver driver=new ChromeDriver();
        driver.get("http://accounts.vmmaps.com");
    }
    @Test(priority = 1)
    public void registration1(){
        driver.findElement(id("registerHere")).click();
        driver.findElement(By.id("signup-username")).sendKeys("abcedf");
        driver.findElement(By.id("signup-email")).sendKeys("qwerty@9867gmail.com");
        driver.findElement(id("signup-mobile")).sendKeys("9087254613");
        driver.findElement(id("signup-password")).sendKeys("abcd@123");
        driver.findElement(id("confirm-password")).sendKeys("abcd@123");
        driver.findElement(By.id("terms-vms-policy")).click();
        driver.findElement(By.id("signup-submit-text")).click();
        System.out.println("the registration was sucessful");
    }
    @Test(priority = 2)
    public void userNameField1(){
        driver.findElement(id("login-email")).sendKeys("9363673730");
        driver.findElement(id("password")).sendKeys("abcd@123");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("@ is missing");
    }

    @Test(priority = 3)
    public void userNameField2(){
        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys("abcd@123");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        WebElement element1=driver.findElement(By.xpath("//div[text()='Invalid email, please signup and try again']"));
        String text=element1.getText();
        System.out.println(text);
    }

    @Test(priority = 4)
    public void userNameField3(){
        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys("abcd@123");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("Login was successful");
    }

    @Test(priority = 5)
   public void userNameField4(){
        driver.findElement(id("login-email")).sendKeys("abcdef125gmail.com");
        driver.findElement(id("password")).sendKeys("abcd@123");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("@ is missing");
    }

    @Test
    public void userNameField5(){
        driver.findElement(id("login-email")).sendKeys(" ");
        driver.findElement(id("password")).sendKeys("abcd@123");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("Email field is empty");
    }
    @Test(priority = 6)
     public void passwordField1(){

        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys("abcde");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        WebElement element1=driver.findElement(By.xpath("//div[text()='Invalid email, please signup and try again']"));
        String text=element1.getText();
        System.out.println(text);
    }
    @Test(priority = 7)
    public void passwordField2() {

        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys(" ");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("Please fill out this field");
    }
    @Test(priority = 8)
    public void passwordFild3(){
        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys("abcd@164");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("login was successful");
    }
    @Test(priority = 9)
    public void logiButton1(){

        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys("abcd@164");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("login was sucessful");
    }
    @Test(priority = 10)
    public void loginButton2(){
        driver.findElement(id("login-email")).sendKeys("abcdef125gmail.com");
        driver.findElement(id("password")).sendKeys("abcd@164");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("@ is missing");
    }
    @Test(priority = 11)
    public void loginButton3(){
        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys("abcd@");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("");
    }
    @Test(priority = 12)
    public void loginButton4(){
        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys("abcde");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        WebElement element1=driver.findElement(By.xpath("//div[text()='Invalid email, please signup and try again']"));
        String text=element1.getText();
        System.out.println(text);
    }
    @Test(priority = 13)
    public void loginButton5(){
        driver.findElement(id("login-email")).sendKeys("abcdef125gmail.com");
        driver.findElement(id("password")).sendKeys("abcde");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        System.out.println("Email and password are invalid");
    }
    @Test(priority = 14)
    public void forgotPassword1(){
        driver.findElement(id("login-email")).sendKeys("abcdef125@gmail.com");
        driver.findElement(id("password")).sendKeys("abcde");
        WebElement element = driver.findElement(xpath("(//span[@class='Submit'])[1]"));
        element.click();
        WebElement element1=driver.findElement(By.xpath("//div[text()='Invalid email, please signup and try again']"));
        String text=element1.getText();
        System.out.println(text);
    }
    @Test(priority = 15)
    public void forgotPassword2() {
        driver.findElement(xpath("//span[@class='Forgot-Password']")).click();
        System.out.println("security code");
        driver.findElement(id("password")).sendKeys("abcd@456");
        driver.findElement(By.xpath("(//button[@class='Rectangle-8953-otp'])[1]")).click();
        System.out.println("password is changed");
    }
}