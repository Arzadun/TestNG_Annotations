package com.xlCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class InteractionWithButtonsUsingTestNG {

    private WebDriver driver;

    @BeforeSuite
    public void initializeSuite(){
        System.setProperty("C:\\Users\\sebas\\Documents\\XmartCourse", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("beforeSuite");
    }

    @BeforeMethod
    public void initializeTest(){

        driver.get("https://demoqa.com/");

        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void closeChromeInstances(){

        System.out.println("AfterMethod");
    }

    @AfterSuite
    public void afterSuite(){
        driver.close();
        driver.quit();
        System.out.println("afterSuite");
    }

    @Test
    public void simpleTest() {

        waiter(5000);
        WebElement buttonElement = driver.findElement(By.xpath("(//h5)[1]"));

        buttonElement.click();


        waiter(3000);

        WebElement textBox = driver.findElement(By.xpath("(//*[@id=\'item-4\'])[1]"));
        textBox.click();

        waiter(5000);

        //Assertions
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).build().perform();
        waiter(5000);
    }

    @Test
    public void simpleTest2() {

        waiter(5000);
        WebElement buttonElement = driver.findElement(By.xpath("(//h5)[1]"));

        buttonElement.click();


        waiter(3000);

        WebElement textBox = driver.findElement(By.xpath("(//*[@id=\'item-4\'])[1]"));
        textBox.click();

        waiter(5000);

        //Assertions
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).build().perform();
        waiter(5000);
        System.out.println("secondTest");
    }


    public static void waiter(int seconds){
        try {
            Thread.sleep(seconds);
        }catch (Exception e){
            System.out.println("Something happened");
        }
    }




}
