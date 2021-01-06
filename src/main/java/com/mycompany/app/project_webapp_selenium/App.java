package com.mycompany.app.project_webapp_selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    	 ChromeOptions chromeOptions = new ChromeOptions();
         chromeOptions.addArguments("--headless");
         chromeOptions.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
         chromeOptions.addArguments("--window-size=1920x1080"); //should be enabled for Jenkins
    	 WebDriver driver = new ChromeDriver(chromeOptions);
    	 System.out.println("Hi, Welcome to Ramesh Kancherla Webapp testing on Selenium WebDriver");
    	 driver.get("http://192.168.56.110:9090/");
    	 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	 driver.findElement(By.id("About Us")).click();
    	 System.out.println("About page clicked on Ramesh Kancherla Webapp");

         driver.findElement(By.id("PID-ab2-pg")).getText().contains("This is Ramesh Kancherla<b>about</b> page");
         System.out.println("About page text verified on  Ramesh Kancherla Webapp");
       //Thread.sleep(5000);
       // driver.quit();
    }
}
