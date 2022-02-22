package com.xlCourse;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class InteractionsWithInputs {
/*
    public static void main(String[] args) {
        System.setProperty("C:\\Users\\sebas\\Documents\\XmartCourse", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        waiter(5000);
        WebElement buttonElement = driver.findElement(By.xpath("(//h5)[1]"));

        buttonElement.click();


waiter(3000);

        WebElement textBox = driver.findElement(By.xpath("(//*[@id=\'item-0\'])[1]"));
        textBox.click();

        waiter(1000);
 //Form

        String pFullName = "nameA";
        String pEmail = "test@test.com";
        String pAddress = "Address 123";
        String pPermanentAddress = "Permanent Address 123";

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(pFullName);

        WebElement userEmail = driver.findElement(By.xpath("//input[@type='email']"));
        userEmail.sendKeys(pEmail);

        WebElement inputAddress = driver.findElement(By.id("currentAddress"));
        inputAddress.sendKeys(pAddress);

        WebElement inputPermanentAddress = driver.findElement(By.id("permanentAddress"));
        inputPermanentAddress.sendKeys(pPermanentAddress);

        WebElement submitForm = driver.findElement(By.id("submit"));
        submitForm.click();

        waiter(5000);

        //Assertions

        WebElement name = driver.findElement(By.id("name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement currentAddress = driver.findElement(By.xpath("//p[@id=\"currentAddress\"]"));
        WebElement permanentAddress = driver.findElement(By.xpath("//p[@id=\"permanentAddress\"]"));

        if(name.getText().contains(pFullName)){
            System.out.println("Name contiene el texto" + pFullName);
        }else{
            System.out.println("Buuuuuuuu");
        }

        driver.close();
        driver.quit();

    }

    public static void waiter(int seconds){
        try {
            Thread.sleep(seconds);
        }catch (Exception e){
            System.out.println("Something happened");
        }
    }
*/
}
