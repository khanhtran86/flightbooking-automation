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

public class ChangeTab implements Task {

    private final String tabId;

    protected ChangeTab(String tabId) {
        this.tabId = tabId;
    }
    
    @Step("Switch to Flight booking")
    public <T extends Actor> void performAs(T actor) {
    	actor.attemptsTo(Click.on(FlightBookingBox.FLIGHT_TAB));
    }

    public static ChangeTab switchTheTab(String tabId) {
        return instrumented(ChangeTab.class, tabId);
    }

}
