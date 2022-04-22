import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NavigationTest {
	WebDriver driver;

	@Test
	public void navigateToUrl() {
		driver.get("https://phptravels.com/demo/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(),"Demo Script Test drive - PHPTRAVELS");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver1.exe");
		driver = new ChromeDriver();

	}

	@AfterMethod
	public void afterMethod() {
	}

}
