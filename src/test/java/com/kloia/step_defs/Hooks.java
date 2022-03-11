package com.kloia.step_defs;

import com.kloia.utilities.ConfigurationReader;
import com.kloia.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }

    @Given("user navigate to {string}")
    public void user_navigate_to(String url) {
        Driver.get().get(url);
        String title = Driver.get().getTitle();
        if(title.equals("Best Buy International: Select your Country - Best Buy")){
            Driver.get().findElement(By.className("us-link")).click();
        }
    }

}
