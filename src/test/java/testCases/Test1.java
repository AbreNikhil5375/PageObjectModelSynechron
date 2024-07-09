package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.Add2cart;
import pageFactory.DepartmentPage;
import pageFactory.HomePage;
import pageFactory.ItemPage;
import pageFactory.ItemSublistpage;
import pageFactory.Successmsgpage;
import testBase.TestBase;

public class Test1 extends TestBase {

	@Test
	public void testCase1() throws Throwable {
		//openBrowser();

		// Homepage hp=new Homepage();
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DepartmentPage dp = PageFactory.initElements(driver, DepartmentPage.class);
		ItemPage ip = PageFactory.initElements(driver, ItemPage.class);
		ItemSublistpage isp = PageFactory.initElements(driver, ItemSublistpage.class);
		Add2cart acp = PageFactory.initElements(driver, Add2cart.class);
		Successmsgpage sp = PageFactory.initElements(driver, Successmsgpage.class);

		

		//closeBrowser();

	}

}
