package hooks;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ScreenshotUtils;

public class Hooks {
	@Before
	public void setup() {

		DriverFactory.initDriver();

	}

	@After
	public void teardown(Scenario scenario) {

		if (scenario.isFailed()) {

			ScreenshotUtils.capture(scenario.getName());

		}

		DriverFactory.quitDriver();

	}

}