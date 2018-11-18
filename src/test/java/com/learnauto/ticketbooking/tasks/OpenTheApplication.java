package com.learnauto.ticketbooking.tasks;

import com.learnauto.ticketbooking.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;

public class OpenTheApplication implements Task {

    HomePage bookingPage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(bookingPage)
        );
    }
    
    
}
