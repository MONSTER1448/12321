package Counduit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondClass {

    public ChromeDriver driver;
    String email = "urauraura1337@gmail.com";
    String password = "urauraura1337";
    String testdate = "Testinfo";

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Start test");
    }

    @After
    public void close() {
        System.out.println("Close test");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
