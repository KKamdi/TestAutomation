/*import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PCFLogin {

	private static WebDriver driver;

	@Test
	public void loginPCF() {
		login();
	}

	private static boolean login(){

		String sUsername = "ranimonal@yahoo.co.in";
		String sPassword = "Khushi@1234M";
		String url = "https://console.run.pivotal.io/";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--safebrowsing-disable-download-protection");
		System.setProperty("webdriver.chrome.driver", "//chromedriver");
		driver = new ChromeDriver(options);
		driver.get(url);

		WebElement txtUsername = driver.findElement(By.id("email"));
		WebElement btnNext = driver.findElement(By.name("commit"));
		WebElement txtPassword = driver.findElement(By.name("password"));
	//	WebElement btnSubmit = driver.findElement(By.cssSelector(".island-button"));
		
		txtUsername.sendKeys(sUsername);
		btnNext.click();
		txtPassword.sendKeys(sPassword);
		btnNext.click();
		driver.manage().window().maximize();
		return true;
	}
	
}
*/
