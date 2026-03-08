package pages;

import java.util.Set;

import org.openqa.selenium.By;

import base.BasePage;
import base.DriverFactory;
import utils.WaitUtils;

public class ProductPage extends BasePage {

	By price = By.xpath("//span[@class='a-price-whole']");
	By addToCart = By.id("add-to-cart-button");

	public String getPrice() {

		return WaitUtils.waitForVisibility(price).getText();

	}

	public void addToCart() {

		WaitUtils.waitForClickable(addToCart).click();

	}

	public void switchToProductWindow() {

		Set<String> windows = DriverFactory.getDriver().getWindowHandles();

		for (String window : windows) {

			DriverFactory.getDriver().switchTo().window(window);

		}

	}
}