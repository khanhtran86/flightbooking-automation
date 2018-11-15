package com.learnauto.ticketbooking.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightBookingBox {
    public static Target FLIGHT_TAB = Target.the("flight booking").located(By.cssSelector(".tvat-FLIGHT"));
    public static Target FLIGHT_BOX = Target.the("flight box").located(By.cssSelector(".iBi8X"));
    public static Target FLIGHT_SOURCE = Target.the("flight source").located(By.xpath("//input[@data-id=\"flightSource\"]"));
    public static Target FLIGHT_DESTINATION = Target.the("flight destination").located(By.xpath("//input[@data-id=\"flightDestination\"]"));
    public static Target FLIGHT_ROUND_TRIP =  Target.the("flight round trip").located(By.xpath("//input[@data-id=\"flightRoundTrip\"]"));
    public static Target FLIGHT_SEARCH = Target.the("search flight").located(By.xpath("//button[@data-id=\"searchFlightSubmit\"]"));
}
