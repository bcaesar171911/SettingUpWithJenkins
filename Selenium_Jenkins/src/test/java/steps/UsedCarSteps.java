package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;

public class UsedCarSteps {

	UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	@And("^click on \"([^\"]*)\" link on Used Search Car Page$")
	public void click_on_link_on_Used_Search_Car_Page(String arg1) throws Throwable {

		carsGuideHomePageActions.clickOnUsedCarsSearchMenu();

	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown on Used Search Car Page$")
	public void select_carbrand_as_from_AnyMake_dropdown_on_Used_Search_Car_Page(String carBrand) throws Throwable {

		usedCarsSearchPageActions.selectUsedCarMake(carBrand);
	}

	@And("^select car model  on Used Search Car Page$")
	public void select_car_model_on_Used_Search_Car_Page(List<String> list) throws Throwable {

		String menu = list.get(1);
		usedCarsSearchPageActions.selectUsedCarModel(menu);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown on Used Search Car Page$")
	public void select_location_as_from_SelectLocation_dropdown_on_Used_Search_Car_Page(String carLocation)
			throws Throwable {

		usedCarsSearchPageActions.selectUsedCarLocation(carLocation);
	}

	@And("^select price as \"([^\"]*)\" from price dropdown on Used Search Car Page$")
	public void select_price_as_from_price_dropdown_on_Used_Search_Car_Page(String carPrice) throws Throwable {

		usedCarsSearchPageActions.selectUsedCarPrice(carPrice);
	}

	@Then("^click on Find_My_Next_Car button on Used Search Car Page$")
	public void click_on_Find_My_Next_Car_button_on_Used_Search_Car_Page() throws Throwable {

		usedCarsSearchPageActions.clickOnFindMyNxtUsedCarBtn();

	}
}
