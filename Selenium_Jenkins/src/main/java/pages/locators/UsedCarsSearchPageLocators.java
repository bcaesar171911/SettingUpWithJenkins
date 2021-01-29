package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsSearchPageLocators {
	
	@FindBy(how = How.XPATH, using = "//*[@id='makes']")
	public WebElement usedCarMakeDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='models']")
	public WebElement usedCarModelsDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='locations']")
	public WebElement usedCarLocationsDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='price-max']")
	public WebElement usedCarPriceDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='search-submit']")
	public WebElement usedCarFindMyNxtCarBtn;

}
