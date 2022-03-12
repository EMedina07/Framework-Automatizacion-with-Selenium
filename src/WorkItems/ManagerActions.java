package WorkItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ManagerActions {
    static private WebElement elementHtml = null;

    static public void SetText(WebDriver driver, String xpath, String text){
        CreateElementHtml(driver, xpath).clear();
        CreateElementHtml(driver, xpath).sendKeys(text);
    }

    static public void SelectOption(WebDriver driver, String xpath, String option){
        Select selectList = new Select(CreateElementHtml(driver, xpath));
        selectList.selectByVisibleText(option);
    }

    static public void ToDoClick(WebDriver driver, String xpath){
        CreateElementHtml(driver, xpath).click();
    }

    static public WebElement CreateElementHtml(WebDriver driver, String xpath){
        elementHtml = driver.findElement(By.xpath(xpath));
        return elementHtml;
    }
}
