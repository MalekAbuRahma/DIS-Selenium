package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class MainFunction {
    public MainFunction(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[contains(@id,'header')]")
    public WebElement searchBox;

    @FindBy(xpath = "//button[starts-with(@class ,'input-')]")
    public WebElement searchBtn;

    @FindBy(xpath = "//h2[text()='Selenium 3.0 Training']")
    public  WebElement seleniumCourse;


    public void searchForSelenium(){
        this.searchBox.sendKeys("Selenium");
        this.searchBtn.click();
        this.seleniumCourse.click();
    }
}
