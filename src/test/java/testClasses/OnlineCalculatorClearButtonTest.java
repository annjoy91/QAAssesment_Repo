package testClasses;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.BaseClass;
//11revrie comment fixed cgane again review comment2 fix
//11revrie comment fixed cgane again
//212 666666666
//3//2126666666666
//666666666666666666
//br1
//b1
//b2
//test
public class OnlineCalculatorClearButtonTest extends BaseClass {	
	@BeforeMethod
	public void setUp() {
		initialization("https://www.online-calculator.com/full-screen-calculator/");
	}

	@Test(priority = 1, description = "This TestCase will validate functionality of clear button preceded by entry of a numeric ")
	public void divisionTC1() {
		builder.sendKeys(Keys.NUMPAD1).perform();
		builder.sendKeys("c").perform(); // Clear values
		//// Need to implement the validation
	}

	@Test(priority = 2, description = "This TestCase will validate functionality of clear button preceded by entry of non numeric symbol ")
	public void divisionTC2() {
		builder.sendKeys("+").perform();
		builder.sendKeys("c").perform(); // Clear values
		//// Need to implement the validation
	}

	//tes 22222222222222
	//reduced
	@Test(priority = 3, description = "This TestCase will validate functionality of clear button preceded by entry of another clear button click ")
	public void divisionTC3() {
		builder.sendKeys("c").perform(); // 1st clear button click
		builder.sendKeys("c").perform(); // Clear values
		//// Need to implement the validation
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
