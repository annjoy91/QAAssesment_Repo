package testClasses;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.BaseClass;

public class OnlineCalculatorDivisionTest extends BaseClass {
	@BeforeMethod
	public void setUp() {
		initialization("https://www.online-calculator.com/full-screen-calculator/");
	}

	@Test(priority = 1, description = "This TestCase will validate division between two positive integer values (x>y)")
	public void divisionTC1() {
		builder.sendKeys(Keys.NUMPAD2).perform();
		builder.sendKeys("/").perform();
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys(Keys.ENTER).perform();
		// Need to implement the validation
	}

	@Test(priority = 2, description = "This TestCase will validate division between two positive integer values (x<y)")
	public void divisionTC2() {
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys("/").perform();
		builder.sendKeys(Keys.NUMPAD2).perform();
		builder.sendKeys(Keys.ENTER).perform();
		// Need to implement the validation
	}

	@Test(priority = 3, description = "This TestCase will validate division between two negative integer values")
	public void divisionTC3() {
		builder.sendKeys("-").perform();
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys("/").perform();
		builder.sendKeys("-").perform();
		builder.sendKeys(Keys.NUMPAD2).perform();
		builder.sendKeys(Keys.ENTER).perform();
		// Need to implement the validation
	}

	@Test(priority = 4, description = "This TestCase will validate division between a positive and a negative value")
	public void divisionTC4() {
		builder.sendKeys(Keys.NUMPAD3).perform();
		builder.sendKeys("/").perform();
		builder.sendKeys("-").perform();
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys(Keys.ENTER).perform();
		// Need to implement the validation
	}

	@Test(priority = 5, description = "This TestCase will validate division between two decimal values")
	public void divisionTC5() {
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys(".").perform();
		builder.sendKeys(Keys.NUMPAD2).perform();
		builder.sendKeys("/").perform();
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys(".").perform();
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys(Keys.ENTER).perform();
		// Need to implement the validation
	}

	@Test(priority = 6, description = "This TestCase will validate division between a decimal value and an integer")
	public void divisionTC6() {
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys(".").perform();
		builder.sendKeys(Keys.NUMPAD2).perform();
		builder.sendKeys("/").perform();
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys(Keys.ENTER).perform();
		// Need to implement the validation
	}

	@Test(priority = 7, description = "This TestCase will validate division with same number")
	public void divisionTC7() {
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys("/").perform();
		builder.sendKeys(Keys.NUMPAD0).perform();
		builder.sendKeys(Keys.ENTER).perform();
		// Need to implement the validation
	}

	@Test(priority = 8, description = "This TestCase will validate division with zero")
	public void divisionTC8() {
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys("/").perform();
		builder.sendKeys(Keys.NUMPAD0).perform();
		builder.sendKeys(Keys.ENTER).perform();
		// Need to implement the validation
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
