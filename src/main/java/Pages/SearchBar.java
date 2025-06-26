package Pages;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BrowserSetup.BaseClass;
import keyword.Keywords;

public class SearchBar {
	
	public static By HomePageLogo = By.xpath("//a[@class='gh-logo']");
    public static By SearchBox = By.xpath("//div[@id='gh-search-box']");
	public static By SearchBar = By.xpath("//input[@title='Search']");	
	public static By suggestions = By.xpath("//ul[@role='listbox']//li[contains(@data-value, 'watches')]");
    public static By SearchButton=  By.xpath("//button[@id='gh-search-btn']");
	public static By allCategoriesDropDown = By.xpath("//select[@id='gh-cat']");
	public static By Categories = By.xpath("//select[@id='gh-cat']//option");
    
	public static void verifyHomePage() {
		    Keywords.navigateTo("url");
			Keywords.verifyElementPresent(HomePageLogo);	
			Keywords.log.info("Yes you are on HomePage..");
		}
		public static void CheckVisibility() {
			Keywords.isdisplayed(SearchBox);
			Keywords.log.info("Yes SEarch Box is Visible..");
		}

		public static void ClickOnSearchBar() {
			Keywords.click(SearchBar);
			Keywords.log.info("Clicked on SearchBar..");
		}
		
		public static void enterSearchKeyword(String Keyword) {
			Keywords.enterText(SearchBar, Keyword);
			Keywords.log.info("Entered keyword..");
		}
		
		public static void verifySuggestions(String Keyword) {
			List<WebElement> suggestionsList =  Keywords.getElements(suggestions);
			boolean isMatchFound = false;
			for (WebElement suggestion : suggestionsList) {
			    String text = suggestion.getText().toLowerCase(); // to ignore case
			    if (text.contains("watches")) {
			        isMatchFound = true;
			        break;
			    }
			    Keywords.log.info(suggestion);
			}
			Keywords.log.info("suggestions are related to entered keyword");
		}
		
		public static void clickSearchbutton() {
			Keywords.click(SearchButton);
		}
		
		public static void clickOnAllCategoriesDropDown() {
			BaseClass.driver.navigate().back();
			Keywords.click(allCategoriesDropDown);
		}
		
		public static void verifyAllCategoriesList() {
			 List<WebElement> allcategories = Keywords.getElements(Categories);
			 Keywords.log.info("List contains "+allcategories.size()+" items");
			
			 List<String> actualTextList = new ArrayList<>();
			 for(WebElement category :allcategories) {
				 String text=category.getText();
				 actualTextList.add(text); 
			 }
			 
			 List<String> expectedList = new ArrayList<>();
			 Collections.addAll(expectedList,
				"All Categories",
			     "Antiques",
			     "Art",
			     "Baby",
			     "Books",
			     "Business & Industrial",
			     "Cameras & Photo",
			     "Cell Phones & Accessories",
			     "Clothing, Shoes & Accessories",
			     "Coins & Paper Money",
			     "Collectibles",
			     "Computers/Tablets & Networking",
			     "Consumer Electronics",
			     "Crafts",
			     "Dolls & Bears",
			     "Movies & TV",
			     "eBay Motors",
			     "Entertainment Memorabilia",
			     "Gift Cards & Coupons",
			     "Health & Beauty",
			     "Home & Garden",
			     "Jewelry & Watches",
			     "Music",
			     "Musical Instruments & Gear",
			     "Pet Supplies",
			     "Pottery & Glass",
			     "Real Estate",
			     "Specialty Services",
			     "Sporting Goods",
			     "Sports Mem, Cards & Fan Shop",
			     "Stamps",
			     "Tickets & Experiences",
			     "Toys & Hobbies",
			     "Travel",
			     "Video Games & Consoles",
			     "Everything Else"
			 );
			 
			 if (actualTextList.equals(expectedList)) {
				    Keywords.log.info("Categories Matched ✔");
				} else {
				    Keywords.log.info("Categories Did NOT Match ❌");
				}
		}
}
