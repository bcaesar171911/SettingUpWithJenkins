package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarsSearchPageLocators carsSearchPageLocators = null;

	public CarsSearchPageActions() {
		this.carsSearchPageLocators = new CarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocators);
	}

	public void selectCarMake(String carBrand) {

		Select selectCarMaker = new Select(carsSearchPageLocators.carMakeDropdown);
		selectCarMaker.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carModel) {

		Select selectCarModel = new Select(carsSearchPageLocators.carModelDropdown);
		selectCarModel.selectByVisibleText(carModel);
	}

	public void selectLocation(String location) {

		Select selectLocation = new Select(carsSearchPageLocators.locationsDropdown);
		selectLocation.selectByVisibleText(location);
	}

	public void selectCarPrice(String carPrice) {

		Select selectCarPrice = new Select(carsSearchPageLocators.carPriceDropdown);
		selectCarPrice.selectByVisibleText(carPrice);
	}
	
	public void clickOnFindMyNxtCarBtn() {
		carsSearchPageLocators.findMyNxtCarBtn.click();
	}
}
