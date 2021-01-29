package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {

		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	public void moveToCarsForSaleMenu() {
		
			Actions action = new Actions(SeleniumDriver.getDriver());
			action.moveToElement(carsGuideHomePageLocators.carsForSaleLink).perform();;
	}

	public void clickOnSearchCarsMenu() {
		
		// do moveToCarsForSaleMenu before
		carsGuideHomePageLocators.searchCarsLink.click();
	}

	public void clickOnUsedCarsSearchMenu() {
		
		// do moveToCarsForSaleMenu before
		carsGuideHomePageLocators.usedCarsLink.click();
	}
	
	public void moveToSellMyCarMenu() {
		
		carsGuideHomePageLocators.sellMyCarLink.click();
	}
	
	public void reviewsMenu() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.reviewsLink).perform();;
	}
}
