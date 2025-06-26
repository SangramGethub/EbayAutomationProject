package Pages;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import keyword.Keywords;

public class Fashion {
	
	public static By FashionCategory = By.xpath("(//div[@id='vl-flyout-nav']//a[text()='Fashion'])[1]");
	public static By Product = By.xpath("//a[text()='Sneakers']");
    public static By Man_sneaker_Size;
    public static By Brandxpath  = By.xpath("(//button[.//span[text()='Brand']])[1]");
	public static By Nike;
	public static By filtersApplied = By.xpath("//button[.//span[contains(text(),'filters applied')]]");
    public static By filtersxpath= By.xpath("//span[@class='filter-link__cell']//span[@class='filter-label']");
    public static By viewicon = By.xpath("(//button[contains(@aria-label, 'Gallery View')])");
    public static By galleryView = By.xpath("//button[contains(@aria-label, 'View')]");
    public static By listview = By.xpath("//a[@class='fake-menu-button__item']//span[text()='List View']");
    
    
    public static void mousehoverOnFashionCategory() {
		Keywords.mouseHover(FashionCategory);
	}
	
	public static void Selectproduct(String product) {
		Keywords.waitTillVisible(Product);
		Keywords.click(Product);
		Keywords.log.info("Product selected..");
	}
	public static void scrolluptoManSize() {
		Keywords.ScrollBy(300);
		Keywords.log.info("Page scrolled...");
	}
	public static void SelectSize(String size) {
		Man_sneaker_Size = By.xpath("(//section[@class='brw-category-nav']//a[text()='" + size + "'])[1]");
		Keywords.click(Man_sneaker_Size);
		Keywords.log.info("Size selected..");
	}
	public static void selectBrand(String Brand) {
		Keywords.click(Brandxpath);
		Nike = By.xpath("//li[contains(@class,'brwr__inputs')]//label//span[text()='"+ Brand + "']");
		Keywords.waitTillVisible(Nike);
		Keywords.click(Nike);
		Keywords.log.info("Brand selected..");
	}
	public static void verifyAppliedFilters() {
		Keywords.click(filtersApplied);
		Keywords.log.info("clicked applied filters...");
		List<WebElement> filters = Keywords.getElements(filtersxpath);
		 List<String> actualfilterList = new ArrayList<>();
		 for(WebElement category :filters) {
			 String text=category.getText();
			 Keywords.log.info(text);
			 actualfilterList.add(text); 	 
		 }
		 List<String> expectedList = new ArrayList<>();
		 Collections.addAll(expectedList,"US Shoe Size: 8","Brand: Nike","Price: Over $100");
		 
		 if (actualfilterList.equals(expectedList)) {
			    Keywords.log.info("Categories Matched ✔");
			}else {
			    Keywords.log.info("Categories Did NOT Match ❌");
			} 
	}
	public static void ClickViewDropdown() {
		Keywords.log.info("trying to click");
		Keywords.click(viewicon);
	}
	
	public static void SelectListView() {
		Keywords.scrollToElement(viewicon);
		Keywords.click(viewicon);
		Keywords.waitTillVisible(listview);
		Keywords.click(listview);
	}
	
	
	
}
