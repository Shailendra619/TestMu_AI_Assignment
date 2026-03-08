package pages;

import org.openqa.selenium.By;

import base.BasePage;
import utils.WaitUtils;

public class AmazonHomePage extends BasePage {
	By searchBox = By.id("twotabsearchtextbox");
	By searchBtn = By.id("nav-search-submit-button");

	public void searchProduct(String product) {

		WaitUtils.waitForVisibility(searchBox).sendKeys(product);
		WaitUtils.waitForClickable(searchBtn).click();

	}

}