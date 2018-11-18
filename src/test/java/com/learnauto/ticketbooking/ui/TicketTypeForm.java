package com.learnauto.ticketbooking.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TicketTypeForm {
    public static Target FLIGHT_TAB = Target.the("Flight Tab").located(By.cssSelector(".tvat-FLIGHT"));
    public static Target DEPARTURE = Target.the("Departing From field ").located(By.xpath("//input[@data-id=\"flightSource\"]"));
    public static Target DESTINATION = Target.the("Going To field ").located(By.xpath("//input[@data-id=\"flightDestination\"]"));
    public static Target SEARCH_TICKETS = Target.the("Search tickets button").located(By.xpath("//button[@data-id=\"searchFlightSubmit\"]"));
   
    public static Target FLIGHT_BOX = Target.the("flight box").located(By.cssSelector(".iBi8X"));
    public static Target FLIGHT_ROUND_TRIP =  Target.the("flight round trip").located(By.xpath("//input[@data-id=\"flightRoundTrip\"]"));
    public static Target FLIGHT_DATE = Target.the("flight date").located(By.xpath("//input[@data-id=\"datepickerFlightSource\"]"));
    public static Target FLIGHT_PASSENTER_INPUT = Target.the("flight input box").located(By.cssSelector(".tvat-passengers"));
    public static Target FLIGHT_PASSENGER = Target.the("flight passenger").located(By.xpath("//input[@data-id=\"flightPassengersAdult\"]"));
}