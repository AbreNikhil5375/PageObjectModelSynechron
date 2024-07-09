package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepartmentPage {
	@FindBy(xpath = "//span[text()=\"Men's Watches\"]")
	public WebElement menswatches;

	@FindBy(xpath = "//span[text()=\"Movies & TV\"]")
	public WebElement movieandtv;

	@FindBy(xpath = "(//span[text()=\"Toys & Games\"])[2]")
	public WebElement toysandgames;

	public void selectcheckbox(String checkbox) {
		if (checkbox.equalsIgnoreCase("menswatches"))
			menswatches.click();
		else if (checkbox.equalsIgnoreCase("movieandtv"))
			movieandtv.click();
		else if (checkbox.equalsIgnoreCase("toysandgames"))
			toysandgames.click();

	}

}
