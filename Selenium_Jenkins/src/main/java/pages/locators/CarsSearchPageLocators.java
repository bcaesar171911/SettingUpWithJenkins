package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsSearchPageLocators {
	
	@FindBy(how = How.XPATH, using = "//*[@id='makes']")
	public WebElement carMakeDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='models']")
	public WebElement carModelDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='locations']")
	public WebElement locationsDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='price-max']")
	public WebElement carPriceDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='search-submit']")
	public WebElement findMyNxtCarBtn;
}
