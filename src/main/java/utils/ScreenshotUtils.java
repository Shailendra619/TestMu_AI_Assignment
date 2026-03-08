package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.DriverFactory;

public class ScreenshotUtils {

	public static void capture(String name) {

		try {

			if (DriverFactory.getDriver() == null) {
				return;
			}

			TakesScreenshot ts = (TakesScreenshot) DriverFactory.getDriver();

			File src = ts.getScreenshotAs(OutputType.FILE);

			File dest = new File("screenshots/" + name + ".png");

			FileUtils.copyFile(src, dest);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}