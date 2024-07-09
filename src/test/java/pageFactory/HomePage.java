package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	// WebElements + BusinessLogic(UDFs)
	// WebElement todaysdeal =
	// driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
	@FindBy(xpath = "//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")
	public WebElement dismiss;

	@FindBy(xpath = "//a[text()=\"Today's Deals\"]")
	public WebElement todaydeal;

	public void clickondismiss() {
		
		try {
			dismiss.click();
			}catch(Throwable t) {}
		
	}

	public void clickontodaysdeal() {
		todaydeal.click();
	}

}
