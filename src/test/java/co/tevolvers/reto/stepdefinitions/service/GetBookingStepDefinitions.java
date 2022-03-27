package co.tevolvers.reto.stepdefinitions.service;

import co.tevolvers.reto.models.BookingModel;
import co.tevolvers.reto.tasks.service.GetBooking;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class GetBookingStepDefinitions {

    @When("^User want get booking to service (.*)$")
    public void userWantGetBookingToService(String caso,List<BookingModel> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(GetBooking.withData(datos).withCase(caso));
    }
}
