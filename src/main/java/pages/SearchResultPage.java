package pages;

import org.openqa.selenium.By;

import base.BasePage;
import utils.WaitUtils;

public class SearchResultPage extends BasePage {

	By firstProduct =
			By.xpath("(//div[@data-component-type='s-search-result']//h2/a)[1]");
	public void selectFirstProduct(){

		WaitUtils.waitForClickable(firstProduct).click();

		}

}