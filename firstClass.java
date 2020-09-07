package Counduit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstClass extends secondClass {

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://react-redux.realworld.io/#/?_k=w5lfui");
        driver.findElementByXPath("//*[@id=\"main\"]/div/nav/div/ul/li[2]/a").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[1]/input").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[1]/input").sendKeys(email);
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[2]/input").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[2]/input").sendKeys(password);
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/button").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//*[@id=\"main\"]/div/nav/div/ul/li[2]/a").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[1]/input").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[1]/input").sendKeys(testdate);
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[2]/input").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[2]/input").sendKeys(testdate);
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[3]/textarea").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[3]/textarea").sendKeys(testdate);
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[4]/input").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/fieldset[4]/input").sendKeys(testdate);
        driver.findElementByXPath("//*[@id=\"main\"]/div/div/div/div/div/form/fieldset/button").click();
        Thread.sleep(5000);
        WebElement e1 = driver.findElementByXPath("//*[@id=\"main\"]/div/div/div[2]/div[1]/div/div/p");
        WebElement e2 = driver.findElementByXPath("//*[@id=\"main\"]/div/div/div[1]/div/h1");
        if (e1.getText().equals("Testinfo")){
            System.out.println("Article's title is tested and equal");

        }else {
            System.out.println("Testdate is not equal to title article");
        }
        if(e2.getText().equals("Testinfo")){
            System.out.println("Article's title is tested and equal");
        }else {
            System.out.println("Testdate is not equal to title article");
        }
    }
}
