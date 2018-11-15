package com.learnauto.ticketbooking.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.learnauto.ticketbooking.tasks.OpenTheApplication;
import com.learnauto.ticketbooking.tasks.SearchFlight;
import com.learnauto.ticketbooking.ui.FlightBookingBox;
import com.learnauto.ticketbooking.tasks.ChangeTab;


import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void switch_flight_booking_should_show_the_booking_form() {
    //public void search_results_should_show_the_search_term_in_the_title() {

        givenThat(anna).wasAbleTo(openTheApplication);

		when(anna).attemptsTo(
        		SearchFlight.a("flight").from("Hà Nội (HAN)").to("TP HCM (SGN)")
        );
        

    }
}