package com.swiggy.teststeps;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.swiggy.pages.LandingPageon_Add_food;
import com.swiggy.pages.SwiggyFood_Select;
import com.swiggy.pages.SwiggyLocation_Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwiggyMainOrder_food extends Driver1{
	
	
	@Given("a user in the swiggy homepage")
	public void a_user_in_the_swiggy_homepage() {
		assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
		
	    
	}

	@When("Type your delivery location as ‘Hyderabad’ and select the first option from the auto-complete box.")
	public void type_your_delivery_location_as_hyderabad_and_select_the_first_option_from_the_auto_complete_box() {
		landingPageon_Add_food.hoverOverToCart();.searchProduct("Hyderabad");
	}

	@When("Click on the first restaurant shown under ‘Top restaurant chains in Hyderabad’.")
	public void click_on_the_first_restaurant_shown_under_top_restaurant_chains_in_hyderabad() throws InterruptedException {
		landingPageon_Add_food.hoverOverToCart();.item();
	    
	}

	@When("Click on ‘Add’ button corresponding to first listed dish.")
	public void click_on_add_button_corresponding_to_first_listed_dish() throws InterruptedException {
		LandingPageon_Add_food.addItem();
	    
	}

	@When("Hover over ‘Cart’ in the top right corner.")
	public void hover_over_cart_in_the_top_right_corner() throws InterruptedException {

		LandingPageon_Add_food.hoverOverToCart();
	    
	}

	@When("Click on ‘Check Out’ in the sub-menu.")
	public void click_on_check_out_in_the_sub_menu() throws InterruptedException {
		LandingPageon_Add_food.checkItem();
	    
	}

	@Then("Verify the text ‘To place your order now, log in to your existing account or sign up.’ Is visible on the next page sucessfully.")
	public void verify_the_text_to_place_your_order_now_log_in_to_your_existing_account_or_sign_up_is_visible_on_the_next_page_sucessfully() throws InterruptedException {
	    Thread.sleep(3000);
		String expectedText="To place your order now, log in to your existing account or sign up.";
		String actualText=LandingPageon_Add_food.getText();
		Assert.assertEquals(actualText,expectedText);
	}


}