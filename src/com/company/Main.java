package com.company;
import Controllers.ActionsController;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

    }
}
