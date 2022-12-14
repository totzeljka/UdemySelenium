import java.io.File;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySQLPractise {

	public static void main(String[] args) throws InterruptedException, IOException, SQLException {

		// jdbcconection, napravi se tabela u msql

		String host = "localhost";

		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root",
				"mypassword");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from credentials where scenario ='zerobalancecard'");

		// umesto ovoga koristimo while loop kako bi ubacili seleniujum da povuce
		// informacije iz baze
		// rs.next();
		// System.out.println(rs.getString("username"));
		// System.out.println(rs.getString("password"));

		while (rs.next())

		{
				//moze bolo koji driver, npr firefox-geko
			WebDriver driver = new ChromeDriver();

			driver.get("https://login.salesforce.com");

			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));

			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));

		}

	}

}
