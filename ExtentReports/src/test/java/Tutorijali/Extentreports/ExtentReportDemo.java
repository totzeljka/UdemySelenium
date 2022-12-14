package Tutorijali.Extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		
		//ExtentReports, ExtentSparkReporter
		//da bi se dinamicki napravio put u javi koristi se System.getProperty i user.dir
		String path = System.getProperty("user.dir")+"//reports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Zeljka Tot");
	}
	
	
	@Test
	public void initialDemo() {
		
		ExtentTest test = extent.createTest("InitialDemo");
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(	driver.getTitle());
		driver.close();
		
		/*//samo sad fejlujemo namerno ovo se inace ne radi sem kada ubacujeme lisenere za fejlovane testove, ovde ce test proci odradice isto ali u index.html ce pisati da je fail
		test.fail("Result does not match.");
		*/
		extent.flush();
		
	}
	
	
}
