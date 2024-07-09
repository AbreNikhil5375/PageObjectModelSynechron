package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add2cart {

	@FindBy(id = "add-to-cart-button")
	public WebElement add2cart;

	public void clickonadd2cart() {
		add2cart.click();
	}

}
