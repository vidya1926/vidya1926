package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends CommonClass {

	@BeforeClass
	public void setfile() {
		excelfile = "CreateLead";
	}

	@Test(dataProvider = "data")
	public void runCreateLead(String cname, String fname, String lname) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();

	}

	/*
	 * String[][] values = new String[2][3];// 2 rows and 3 columns values[0][0] =
	 * "TL"; values[0][1] = "Hari"; values[0][2] = "R";
	 * 
	 * values[1][0] = "Testleaf"; values[1][1] = "Vidya"; values[1][2] = "R"; return
	 * values;
	 */

}
