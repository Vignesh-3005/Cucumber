package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {
	WebDriver driver;

	@Given("User is on the Adactin Hotel page")
	public void user_is_on_the_Adactin_Hotel_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("User should perform lolgin {string} and {string}")
	public void user_should_perform_lolgin_and(String name, String pass) {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(name);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
		WebElement tbnLogin = driver.findElement(By.id("login"));
		tbnLogin.click();

	}

	@When("User should search hotel {string},{string},{string},{string},{string}, {string}, {string} and {string}")
	public void user_should_search_hotel_and(String location, String hotels, String roomTYpe, String onOfRooms,
			String checkInDate, String checkOutDate, String noOfAdult, String noOfChild) {
		WebElement searchLOcation = driver.findElement(By.id("location"));
		searchLOcation.sendKeys(location);
		WebElement searchHotels = driver.findElement(By.id("hotels"));
		searchHotels.sendKeys(hotels);
		WebElement searchRoomType = driver.findElement(By.id("room_type"));
		searchRoomType.sendKeys(roomTYpe);
		WebElement searchNoOfRooms = driver.findElement(By.id("room_nos"));
		searchNoOfRooms.sendKeys(onOfRooms);
		WebElement searchCheckIn = driver.findElement(By.id("datepick_in"));
		searchCheckIn.sendKeys(checkInDate);
		WebElement searchCheckOut = driver.findElement(By.id("datepick_out"));
		searchCheckOut.sendKeys(checkOutDate);
		WebElement searchAdult = driver.findElement(By.id("adult_room"));
		searchAdult.sendKeys(noOfAdult);
		WebElement searchChild = driver.findElement(By.id("child_room"));
		searchChild.sendKeys(noOfChild);
		WebElement clickSubmit = driver.findElement(By.id("Submit"));
		clickSubmit.click();

	}

	@When("User should select hotel")
	public void user_should_select_hotel() {
		WebElement btnSelect = driver.findElement(By.id("radiobutton_0"));
		btnSelect.click();
		WebElement continueSelect = driver.findElement(By.id("continue"));
		continueSelect.click();

	}

	@When("User should book a hotel {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_book_a_hotel_and(String firstName, String lastName, String address, String cardNo,
			String cardType, String month, String year, String ccvNo) {
		WebElement sendFirstName = driver.findElement(By.id("first_name"));
		sendFirstName.sendKeys(firstName);
		WebElement sendLastName = driver.findElement(By.id("last_name"));
		sendLastName.sendKeys(lastName);
		WebElement sendAddress = driver.findElement(By.id("address"));
		sendAddress.sendKeys(address);
		WebElement sendCardNo = driver.findElement(By.id("cc_num"));
		sendCardNo.sendKeys(cardNo);
		WebElement sendCardType = driver.findElement(By.id("cc_type"));
		sendCardType.sendKeys(cardType);
		WebElement sendMonth = driver.findElement(By.id("cc_exp_month"));
		sendMonth.sendKeys(month);
		WebElement sendYear = driver.findElement(By.id("cc_exp_year"));
		sendYear.sendKeys(year);
		WebElement sendCCVNo = driver.findElement(By.id("cc_cvv"));
		sendCCVNo.sendKeys(ccvNo);
		WebElement clickBookNow = driver.findElement(By.id("book_now"));
		clickBookNow.click();
	}

	@When("User should confrim booking")
	public void user_should_confrim_booking() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement getOrderNo = driver.findElement(By.name("order_no"));
		String attribute = getOrderNo.getAttribute("value");
		System.out.println("\n\norder id:" + attribute);

	}

	@Then("user should verify Order id")
	public void user_should_verify() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement bookingVerify = driver.findElement(By.xpath("//td[text()='Booking Confirmation ']"));
		String text = bookingVerify.getText();
		Assert.assertTrue("verify message", text.contains("Confirmation"));

		// Assert.assertEquals("Verification Message", "Booking Confrimation", text);
		driver.quit();
		System.out.println(text);
		System.out.println("GIT Verification");
	}

}
