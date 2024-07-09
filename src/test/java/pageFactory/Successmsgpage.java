package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class Successmsgpage extends TestBase {

	@FindBy(xpath = "//h1[contains(text(),'Added to Cart')]")
	public WebElement successmsg;

	public void verifysucesmsg() {
		String text = successmsg.getText();
		System.out.println("Actual text =" + text);
		st.assertEquals(text, "Added to Cart");

		st.assertAll();
	}

}
