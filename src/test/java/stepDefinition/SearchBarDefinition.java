package stepDefinition;

import Pages.SearchBar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keyword.Keywords;

public class SearchBarDefinition {

	@Given("user is on HomePage")
	public void user_is_on_home_page() {
	    SearchBar.verifyHomePage();
	}

	@Given("Search box is visible")
	public void search_box_is_visible() {
	   SearchBar.CheckVisibility();
	}

	@Then("click on SearchBar")
	public void click_on_search_bar() {
	    SearchBar.ClickOnSearchBar();
	}

	@Then("Enter {string} Keyword")
	public void enter_keyword(String Keyword) {
	    SearchBar.enterSearchKeyword(Keyword);
	}

	@Then("Verify the suggestions are related to {string}")
	public void verify_the_suggestions_are_related_to(String Keyword) {
	    SearchBar.verifySuggestions(Keyword);
	}

	@Then("Click on SearchButton")
	public void click_on_search_button() {
	   SearchBar.clickSearchbutton();
	}

	@Then("Take a screenshot")
	public void take_a_screenshot() {
	    Keywords.takeScreenshot("SearchResults");
	}
	

	@When("Click on allcategories Dropdown")
	public void click_on_allcategories_dropdown() {
		
		SearchBar.clickOnAllCategoriesDropDown();
	}

	@Then("Verify the list")
	public void verify_the_list() {
	   SearchBar.verifyAllCategoriesList();
	}

	
}
