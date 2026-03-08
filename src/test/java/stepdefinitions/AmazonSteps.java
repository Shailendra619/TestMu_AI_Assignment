package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomePage;
import pages.ProductPage;
import pages.SearchResultPage;
import org.testng.Assert;

public class AmazonSteps {
	AmazonHomePage home = new AmazonHomePage();
	SearchResultPage result = new SearchResultPage();
	ProductPage product = new ProductPage();

	String price;

	@When("User searches for {string}")
	public void searchProduct(String device) {

		home.searchProduct(device);

	}

	@And("Selects the product")
	public void selectProduct(){

	    result.selectFirstProduct();   // click product from search result

	    product.switchToProductWindow();   // switch to new tab opened by Amazon

	}
	@And("Adds product to cart")
	public void addToCart() {

		price = product.getPrice();
		product.addToCart();

	}

	@Then("Verify price is displayed")
	public void verifyPrice() {

		System.out.println("Device Price : " + price);

		Assert.assertNotNull(price);

	}

}