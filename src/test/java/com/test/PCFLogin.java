package com.test;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
*/
public class PCFLogin{
private static WebDriver driver;
/*String sTcName = this.getClass().getSimpleName();
public static ExtentReports extent;
public static ExtentTest test;
public static ExtentTest logger;
public static ITestResult result;
@BeforeSuite
public void beforesuite() {
	String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
	
	extent = new ExtentReports(System.getProperty("user.dir")+"\\Reporting\\"+sTcName+" "+timestamp+".html");
}

@BeforeMethod
public void beforemethod() {
	test = extent.startTest(this.getClass().getSimpleName(), "testcase");
	test.assignAuthor("Krutika");
	test.assignCategory("SOA-Report");
}*/

@BeforeTest
public void baseurl() {
	String url = "https://console.run.pivotal.io/";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AN0C69474\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("launching browser");
	driver.get(url);
}
	@Test
	public void loginPCF() throws InterruptedException {

		String stitle = driver.getTitle();
		System.out.println(stitle);
		String sUsername = "ranimonal@yahoo.co.in";
		String sPassword = "Khushi@1234M";
		//Thread.sleep(10000);
		WebElement txtUsername = driver.findElement(By.xpath("//input[@name='email']"));
		txtUsername.sendKeys(sUsername);
		System.out.println("Entered Username");
		WebElement btnNext = driver.findElement(By.xpath("//div/input[@name='commit']"));
		
		btnNext.click();
		WebElement txtPassword = driver.findElement(By.name("password"));
		
		txtPassword.sendKeys(sPassword);
		btnNext = driver.findElement(By.xpath("//div/input[@value='Sign in']"));
		btnNext.click();
		driver.manage().window().maximize();

	}
	/*@AfterTest
	public void endSession() {
		driver.quit();
	
	}*/
	
	
}
