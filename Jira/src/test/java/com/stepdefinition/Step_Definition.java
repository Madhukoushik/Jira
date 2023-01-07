package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.cucu.adactin.runner.Runner_Class;
import com.pom.adactin.Book_Hotel;
import com.pom.adactin.Hotel_Search;
import com.pom.adactin.Login_Page;
import com.pom.adactin.Select_Hotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.codec.compression.Snappy;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;
	public static Login_Page login = new Login_Page(driver);
	public static Hotel_Search search = new Hotel_Search(driver);
	public static Select_Hotel Select = new Select_Hotel(driver);
	public static Book_Hotel Book = new Book_Hotel(driver);

	@Given("user Launch The Adactin Url")
	public void user_launch_the_adactin_url()  {
		url(driver, "https://adactinhotelapp.com/");
	}

	@When("user enter Username In Username Field")
	public void enter_username_in_username_field() {
		send_Keys(login.getUser_Name(),"Madhukoushik");
	}

	@When("user enter Password In password Field")
	public void enter_password_in_password_field() {
		send_Keys(login.getPass(),"koushik46");
	}

	@Then("user Click The Login Button And IT Navigate To Search Hotel Page")
	public void user_click_the_login_button_and_it_navigate_to_search_hotel_page() {
		click(login.getLog_btn());
	}

	@When("user Select The Location In Location Field")
	public void user_select_the_location_in_location_field()  {
		select_Text(search.getLocation(), "London");
	}

	@When("user Select The Hotel In Hotels Field")
	public void user_select_the_hotel_in_hotels_field() {
		select_Value(search.getHotel(), "Hotel Sunshine");
	}

	@When("user Select The Room type In Room TYpe Field")
	public void user_select_the_room_type_in_room_t_ype_field() {
		select_Index(search.getRoom(), 4);
	}

	@When("user Select The No Of Rooms In No Of Rooms Field")
	public void user_select_the_no_of_rooms_in_no_of_rooms_field() {
		select_Value(search.getRoom_No(), "3");
	}

	@When("user Enter The Check In Date In Check In Date Field")
	public void user_enter_the_check_in_date_in_check_in_date_field() {
		Clear(search.getCheck_In());
		send_Keys(search.getCheck_In(), "6/01/2023");
	}

	@When("user Enter The Check Out Date In Check Out Date Field")
	public void user_enter_the_check_out_date_in_check_out_date_field() {
		Clear(search.getCheck_Out());
		send_Keys(search.getCheck_Out(), "8/01/2023");
	}

	@When("user Select The Adults Per Room In Aduts Per Room Field")
	public void user_select_the_adults_per_room_in_aduts_per_room_field() {
		select_Index(search.getAdult(), 2);
	}

	@When("user Select The Children Per Room In Children Per Room Field")
	public void user_select_the_children_per_room_in_children_per_room_field() {
		select_Value(search.getChild(), "1");
	}

	@Then("user Click The Search Button And It Navigate To Select Hotel Page")
	public void user_click_the_search_button_and_it_navigate_to_select_hotel_page() {
		click(search.getSearch_Btn());
	}

	@When("user Click The RadioButton In The Select RadioButton Field")
	public void user_click_the_radio_button_in_the_select_radio_button_field()  {
		click(Select.getRadio_btn());
	}

	@Then("user Click The Continue Button And It Navigate To Bokk A Hotel Page")
	public void user_click_the_continue_button_and_it_navigate_to_bokk_a_hotel_page() {
		click(Select.getSubmit_Btn());
	}

	@When("user Enter The First Name In The First Name Field")
	public void user_enter_the_first_name_in_the_first_name_field() throws InterruptedException {
		send_Keys(Book.getFirst_Name(), "Madhukoushik");
	}

	@When("user Enter The Last Name In The Last Name Field")
	public void user_enter_the_last_name_in_the_last_name_field() {
		send_Keys(Book.getLast_Name(), "T");
	}

	@When("user Enter The Billing Address In The Billing Address Field")
	public void user_enter_the_billing_address_in_the_billing_address_field() {
		send_Keys(Book.getBill_Address(), "qwertyuiop[asdfghjkl;sdfghjkl;");
	}

	@When("user Enter The Credt Card Number In The Credit Card Number Field")
	public void user_enter_the_credt_card_number_in_the_credit_card_number_field() {
		send_Keys(Book.getCard(), "1234567890123456");

	}

	@When("user Select The Credit Card Type In The Credit Card Type Field")
	public void user_select_the_credit_card_type_in_the_credit_card_type_field() {
		select_Text(Book.getCard_Type(), "VISA");
	}

	@When("user Select The Month In The Month Field")
	public void user_select_the_month_in_the_month_field() {
		select_Value(Book.getMonth(), "4");
	}

	@When("user Select The Year In The Year Field")
	public void user_select_the_year_in_the_year_field() {
		select_Text(Book.getYear(), "2022");
	}

	@When("user Enter The Cvv In The Cvv Field")
	public void user_enter_the_cvv_in_the_cvv_field() {
		send_Keys(Book.getCvv(), "345");
	}

	@Then("user Click The Book Now Button")
	public void user_click_the_book_now_button() {
		click(Book.getBook_Btn());
		
	}

}
