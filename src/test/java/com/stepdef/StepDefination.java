package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	WebDriver driver;
	@Given("customer is in a adaction hotel login page")
	public void customer_is_in_a_adaction_hotel_login_page() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}

	@When("customer should giver {string} and {string}")
	public void customer_should_giver_and(String string, String string2) {
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(string);
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(string2);
	}

	@When("customer should click login button")
	public void customer_should_click_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("customer should fill the search hotel page {string} {string} {string} {string} {string} {string} {string} {string}")
	public void customer_should_fill_the_search_hotel_page(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	  
		WebElement location = driver.findElement(By.id("location"));
		Select s1=new Select(location);
		s1.selectByVisibleText(string);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2=new Select(hotels);
		s2.selectByVisibleText(string2);
		
		WebElement RoomType = driver.findElement(By.id("room_type"));
		Select s3=new Select(RoomType);
		s3.selectByVisibleText(string3);
		
		WebElement noofrooms = driver.findElement(By.id("room_nos"));
		Select s4=new Select(noofrooms);
		s4.selectByVisibleText(string4);
		
		WebElement chekin = driver.findElement(By.id("datepick_in"));
		chekin.sendKeys(string5);
		
		WebElement chekout = driver.findElement(By.id("datepick_out"));
		chekout.sendKeys(string6);
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s7=new Select(adult);
		s7.selectByVisibleText(string7);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s8=new Select(child);
		s8.selectByVisibleText(string8);
		}

	@When("customer should click the search button")
	public void customer_should_click_the_search_button() {
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
	}

	@When("customer should select the hotel and click to continue button")
	public void customer_should_select_the_hotel_and_click_to_continue_button() {
		WebElement sele = driver.findElement(By.id("radiobutton_0"));
		sele.click();
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
	}

	@When("customer should book a hotel {string} {string} {string} {string} {string} {string} {string} {string}")
	public void customer_should_book_a_hotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys(string);
		
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys(string2);
	
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys(string3);
		
		WebElement cno = driver.findElement(By.id("cc_num"));
		cno.sendKeys(string4);
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s=new Select(cctype);
		s.selectByVisibleText(string5);
		
		WebElement expmnth = driver.findElement(By.id("cc_exp_month"));
		Select s2=new Select(expmnth);
		s2.selectByVisibleText(string6);
		
		WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		Select s3=new Select(expyr);
		s3.selectByVisibleText(string7);
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys(string8);
	}

	@When("customer should click on Book Now button")
	public void customer_should_click_on_Book_Now_button() throws InterruptedException {
		
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(5000);
	}

	@When("customer should check booking conformation and get the oder id")
	public void customer_should_check_booking_conformation_and_get_the_oder_id() {
		
		WebElement oderid = driver.findElement(By.id("order_no"));
		String attribute = oderid.getAttribute("value");
		System.out.println("your booking id is" + attribute);
	}

	@Then("customer should verify the sucessful message")
	public void customer_should_verify_the_sucessful_message() {
		driver.quit();
	}
	private void prakas() {
		System.out.println("prakash 1st updated");
	}
	
	
}




