package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
import utils.ScreenshotUtil;

public class Hooks {

    private static final Logger log = LogManager.getLogger(Hooks.class);

    @Before
    public void setup(Scenario scenario) {

        DriverFactory.initDriver();
        log.info("Starting scenario: " + scenario.getName());
    }

    @AfterStep
    public void addScreenshotForFailedStep(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "Failed Step Screenshot");
        }
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            log.error("Test Failed: " + scenario.getName());

            ScreenshotUtil.takeScreenshot(	
                DriverFactory.getDriver(),
                scenario.getName().replaceAll(" ", "_")
            );
        } 
        else {
            log.info("Test Passed: " + scenario.getName());
        }

        DriverFactory.quitDriver();
    }
}