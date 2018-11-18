package com.learnauto.ticketbooking.features.booking;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.learnauto.ticketbooking.question.TheOutboundJourneySummary;
import com.learnauto.ticketbooking.tasks.OpenTheApplication;
import com.learnauto.ticketbooking.tasks.SearchTheAvailableTickets;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenTrallverBookingATicketStory {

	@Managed(uniqueSession = true)
	public WebDriver hisBrowser;

	String jacob = "Jacob";

	@Steps
	OpenTheApplication openTheApplication;

	@Before
	public void annaCanBrowseTheMobileApp() throws MalformedURLException {
		OnStage.setTheStage(new OnlineCast());
		
		// Given
		theActorCalled(jacob).can(BrowseTheWeb.with(hisBrowser));
		theActorInTheSpotlight().attemptsTo(openTheApplication);
	}

	@Test
	public void search_flight_should_show_the_available_flights() {

		String departure = "Hà Nội (HAN)";
		String destination = "TP HCM (SGN)";

		// When
		theActorInTheSpotlight().attemptsTo(SearchTheAvailableTickets.from(departure).to(destination));
		
		// Then
		theActorInTheSpotlight().should(
				seeThat("the departure station", TheOutboundJourneySummary.origin(), is(equalTo(departure))),
				seeThat("the destination station", TheOutboundJourneySummary.destination(), is(equalTo(destination))));

	}

}