package stepDefinition;

import Pages.Fashion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keyword.Keywords;

public class FashionStepDefinition {

	@When("mouse hover on Fashion category Dropdown")
	public void click_on_fashion_category_dropdown() {
	    Fashion.mousehoverOnFashionCategory();
	}

	@Then("Select {string} value in dropdown list")
	public void select_String_value_in_dropdown_list(String product) {
	   Fashion.Selectproduct("Sneakers");
	}

	@Then("Scroll upto Shop By US Man Size")
	public void scroll_upto_shop_by_us_man_size() {
	    Fashion.scrolluptoManSize();
	}

	@Then("select size {string}")
	public void select_size(String string) {
	    Fashion.SelectSize("8.0");
	}

	@Then("select brand {string}")
	public void select_brand(String string) {
	   Fashion.selectBrand("Nike");
	}

	@Then("Verify the applied Filters")
	public void verify_the_applied_filters() {
	   Fashion.verifyAppliedFilters();
	}

	@When("user clicks on view dropdown")
	public void user_clicks_on_view_dropdown() {
	   Fashion.ClickViewDropdown();
	}
	@Then("Take screenshot to verify is it showing gallery view")
	public void take_screenshot_to_verify_is_it_showing_gallery_view() {
	    Keywords.takeScreenshot("GalleryView");
	}

	@Then("when user selects List view")
	public void when_user_selects_list_view() {
	   Fashion.SelectListView();
	}

	@Then("Take screenshot to verify is it showing List view")
	public void take_screenshot_to_verify_is_it_showing_list_view() {
	   Keywords.takeScreenshot("listView");
	}

}
