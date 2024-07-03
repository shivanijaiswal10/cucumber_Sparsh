package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CobtactSteps {
	WebDriver driver;
	
	
	
	@Given("User has landed on Sparch website in chrome")
	public void user_has_landed_on_sparch_website_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver = new ChromeDriver();
		driver.get("https://www.sparshhospital.com/contact-us/");
	}

	@When("user enters firstname,lastname,email,phone")
	public void user_enters_firstname_lastname_email_phone() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("contact_first_name")).sendKeys("shivani");
		driver.findElement(By.name("contact_last_name")).sendKeys("Jaiswal");
	    driver.findElement(By.id("contact_phone")).sendKeys("9415693508");
	    driver.findElement(By.id("contact_email")).sendKeys("shivi@134gmail.com");
	}

	@When("select hospital and genral enquiry")
	public void select_hospital_and_genral_enquiry() {
	    // Write code here that turns the phrase above into concrete actions
	WebElement dropdown1 = driver.findElement(By.id("contact_hospital"));
	Select s = new Select(dropdown1);
	s.selectByVisibleText("SS SPARSH Hospital, RR Nagar");
	WebElement dropdown2 = driver.findElement(By.id("contact_enquiry_type"));
	s = new Select(dropdown2);
	
	
	s.selectByValue("General Enquiry");
	
	driver.findElement(By.id("contact_message")).sendKeys(" i am not well");
	driver.findElement(By.id("contact_submit")).click();
	
	
	
	   
	}

	@Then("a message is diplayed after succesful from filling")
	public void a_message_is_diplayed_after_succesful_from_filling() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("msg displaying");
	}


}
