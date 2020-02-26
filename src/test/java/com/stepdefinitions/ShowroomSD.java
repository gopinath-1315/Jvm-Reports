package com.stepdefinitions;

import com.baseclasses.BaseClass;

import cucumber.api.java.en.*;
import pojoclasses.PojoShowroom;

public class ShowroomSD extends BaseClass{
	
	@Given("^user has to in home page$")
	public void user_has_to_in_home_page() throws Throwable {
		d.get("https://showroom.com.my/");
			}

	@When("^user has to enter product names \"([^\"]*)\"$")
	public void user_has_to_enter_product_names(String s) throws Throwable {
		PojoShowroom p = PojoShowroom.method();
		click(p.getSearchico());
		click(p.getSearchbar());
		
		fill(p.getSearchbar(),s );	
	}
	@When("^user has to enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_has_to_enter_and(String s1, String s2) throws Throwable {
PojoShowroom p = PojoShowroom.method();
		click(p.getLogicon());
		fill(p.getUser(), s1);
		fill(p.getPass(), s2);
		
	}

@Then("^user has to click login button$")
public void user_has_to_click_login_button() throws Throwable {
PojoShowroom p = PojoShowroom.method();
	click(p.getLoginbtn());
}

	@Then("^user has to click enter button$")
	public void user_has_to_click_enter_button() throws Throwable {
		
		enter();
	}


}
