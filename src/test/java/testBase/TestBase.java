package testBase;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import pageFactory.Add2cart;
import pageFactory.DepartmentPage;
import pageFactory.HomePage;
import pageFactory.ItemPage;
import pageFactory.ItemSublistpage;
import pageFactory.Successmsgpage;

public class TestBase {

	public static Properties prop;
	public static String Browser;
	public static WebDriver driver;
	public static SoftAssert st;
	public static HomePage hp;
	public static DepartmentPage dp ;
	public static ItemPage ip;
	public static ItemSublistpage isp;
	public static Add2cart acp;
	public static Successmsgpage sp;
	@BeforeSuite

	public static void openBrowser() throws Throwable {
		st=new SoftAssert();
		prop = new Properties();
		prop.load(new FileReader("src\\test\\java\\config\\Global.properties"));
		Browser = prop.getProperty("Browser");
		System.out.println("Browser choosen is " + Browser);
		if (Browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (Browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (Browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initclass();
		
	}
	
	public static void initclass() {
		 hp = PageFactory.initElements(driver, HomePage.class);
		 dp = PageFactory.initElements(driver, DepartmentPage.class);
		 ip = PageFactory.initElements(driver, ItemPage.class);
		 isp = PageFactory.initElements(driver, ItemSublistpage.class);
		 acp = PageFactory.initElements(driver, Add2cart.class);
		 sp = PageFactory.initElements(driver, Successmsgpage.class);
	}
	@AfterSuite

	public static void closeBrowser() {
		driver.quit();
	}

}
