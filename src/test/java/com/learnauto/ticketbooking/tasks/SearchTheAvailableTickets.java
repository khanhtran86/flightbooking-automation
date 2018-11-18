package com.learnauto.ticketbooking.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.learnauto.ticketbooking.ui.TicketTypeForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchTheAvailableTickets implements Task {

	private String departureStation;
	private String destinationStation;

	public SearchTheAvailableTickets(String departureStation, String destinationStation) {
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
    }

	public static ViewTheAvailableTicketsBuilder from(String departureStation) {
		return new ViewTheAvailableTicketsBuilder(departureStation);
	}

	public static class ViewTheAvailableTicketsBuilder {
		private String departureStation;

		public ViewTheAvailableTicketsBuilder(String departureStation) {
			this.departureStation = departureStation;
		}

		public Performable to(String destinationStation) {
			return instrumented(SearchTheAvailableTickets.class, departureStation, destinationStation);
		}
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(TicketTypeForm.FLIGHT_TAB),
				Enter.theValue(departureStation).into(TicketTypeForm.DEPARTURE).thenHit(Keys.TAB),
	            Enter.theValue(destinationStation).into(TicketTypeForm.DESTINATION),
				Click.on(TicketTypeForm.SEARCH_TICKETS)
		);
	}

}
