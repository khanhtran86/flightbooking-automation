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

	private static String tabName;
    private static String sourcePlace;
    private static String destinationPlace;

    public static SearchFlight a(String tabName)
    {
    	SearchFlight.tabName = tabName;
    	return instrumented(SearchFlight.class);
    }
    
    public static SearchFlight from(String fromPlace)
    {
    	SearchFlight.sourcePlace = fromPlace;
    	return instrumented(SearchFlight.class);
    }
    
    public static SearchFlight to(String toPlace)
    {
    	Enter.theValue(toPlace).into(FlightBookingBox.FLIGHT_DESTINATION);
    	
    	SearchFlight.destinationPlace = toPlace;
    	return instrumented(SearchFlight.class);
    }
    
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(FlightBookingBox.FLIGHT_TAB),
				Enter.theValue(SearchFlight.sourcePlace).into(FlightBookingBox.FLIGHT_SOURCE),
				Enter.theValue(SearchFlight.destinationPlace).into(FlightBookingBox.FLIGHT_DESTINATION),
				Click.on(FlightBookingBox.FLIGHT_SEARCH)
		);
	}

}
