import Base.TestBase;
import Pages.MainFunction;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestSuit extends TestBase {

    @Test(description = "TC001", priority = 1)
    public void firstCase() {

        MainFunction mainFun = new MainFunction(driver);
        //Search for coures selenium
        String actualTitle = "Simplilearn | Online Courses - Bootcamp & Certification Platform";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        mainFun.searchForSelenium();

//        Get tabs

        ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualURL ="https://www.simplilearn.com/selenium-certification-training?tag=Selenium";
        String expectedURL=driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);

    }


}
