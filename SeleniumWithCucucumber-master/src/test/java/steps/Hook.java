package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

        System.out.println("Opening the browser : Chrome");

        /*System.setProperty("webdriver.firefox.marionette", "C:\\LearningSelenium\\chromedriver_win32\\geckodriver.exe");
        */


        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\LearningSelenium\\chromedriver_win32\\chromedriver.exe");
        base.Driver = new ChromeDriver();
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
        base.Driver.close();
    }

}
