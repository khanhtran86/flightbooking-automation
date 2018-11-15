package com.learnauto.ticketbooking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.learnauto.ticketbooking.ui.FlightBookingBox;;

public class SearchFlight implements Task {

    private final String searchTerm;

    protected SearchFlight(String searchTerm) {
        this.searchTerm = searchTerm;
    }
    
    public static SearchFlight forTheTerm(String searchTerm) {
        return instrumented(SearchFlight.class, searchTerm);
    }
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}

}
