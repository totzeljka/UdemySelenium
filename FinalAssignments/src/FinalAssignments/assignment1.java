package FinalAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Željka/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		// assigntment1
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//or
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(!driver.findElement(By.id("checkBoxOption1")).isSelected());
		//or
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElements(By.cssSelector("//input[@type='checkbox']")).size();
		
	}







		

		
	}
	
	
	
	
	


