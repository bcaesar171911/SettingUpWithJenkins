package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsGuideHomePageLocators;
import pages.locators.UsedCarsSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {

	UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;
	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public UsedCarsSearchPageActions() {

		this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);

	}

	public void clickOnUsedCarsSearchMenu() {

		// do moveToCarsForSaleMenu before
		carsGuideHomePageLocators.usedCarsLink.click();
	}

	public void selectUsedCarMake(String carBrand) {

		Select selectCarMaker = new Select(usedCarsSearchPageLocators.usedCarMakeDropdown);
		selectCarMaker.selectByVisibleText(carBrand);
	}

	public void selectUsedCarModel(String carModel) {

		Select selectCarMaker = new Select(usedCarsSearchPageLocators.usedCarModelsDropdown);
		selectCarMaker.selectByVisibleText(carModel);
	}

	public void selectUsedCarPrice(String carPrice) {

		Select selectCarMaker = new Select(usedCarsSearchPageLocators.usedCarPriceDropdown);
		selectCarMaker.selectByVisibleText(carPrice);
	}

	public void selectUsedCarLocation(String carLocation) {

		Select selectCarMaker = new Select(usedCarsSearchPageLocators.usedCarLocationsDropdown);
		selectCarMaker.selectByVisibleText(carLocation);
	}

	public void clickOnFindMyNxtUsedCarBtn() {
		usedCarsSearchPageLocators.usedCarFindMyNxtCarBtn.click();
	}

}
