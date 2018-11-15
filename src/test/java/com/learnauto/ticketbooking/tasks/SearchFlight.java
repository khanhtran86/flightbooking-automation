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
    private static int bookingDay;
    private static String bookingPassenger;
    
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
    	SearchFlight.destinationPlace = toPlace;
    	return instrumented(SearchFlight.class);
    }
    
    public static SearchFlight at(int day)
    {
    	SearchFlight.bookingDay = day;
    	return instrumented(SearchFlight.class);
    }
    
    public static SearchFlight forPassenger(int passenger)
    {
    	SearchFlight.bookingPassenger= Integer.toString(passenger);
    	return instrumented(SearchFlight.class);
    }
    
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(FlightBookingBox.FLIGHT_TAB),
				Enter.theValue(SearchFlight.sourcePlace).into(FlightBookingBox.FLIGHT_SOURCE),
				Enter.theValue(SearchFlight.destinationPlace).into(FlightBookingBox.FLIGHT_DESTINATION),
				Click.on(FlightBookingBox.FLIGHT_PASSENTER_INPUT),
				Enter.theValue(SearchFlight.bookingPassenger).into(FlightBookingBox.FLIGHT_PASSENGER),
				Click.on(FlightBookingBox.FLIGHT_SEARCH)
		);
	}

}
