package groups;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	@Test
	public void verifyTc() {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		boolean displayed = driver.findElement(By.partialLinkText("CRM")).isDisplayed();
	   String Actualtitle = driver.getTitle();
	   System.out.println(Actualtitle);
	   
	   String Expecttext = "My Home | Opentaps";
	   System.out.println(Expecttext);
	   
		/*
		 * Assert.assertEquals(Expecttext, Actualtitle);
		 * System.out.println("Both are same");
		 */
	   
		/*
		 * Assert.assertFalse(displayed); System.out.println("Assert the element");
		 */

	  // Assert.assertTrue(displayed,"The passed tc");
	   
	   SoftAssert a=new SoftAssert();
	   a.assertEquals(Actualtitle, Expecttext);
	   System.out.println("Both are same");
	   
	   a.assertAll();
	   
	   
	   
	}
	
	@Test
	public void runTest() {
		System.out.println("LearningAssertion");
	}
	
}