package com.learnauto.ticketbooking.question;

import com.learnauto.ticketbooking.ui.OutboundJourneySummary;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheOutboundJourneySummary implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(OutboundJourneySummary.ORIGIN).viewedBy(actor).asString();
	}

	public static Question<String> origin() {
		 return new TheOutboundJourneySummary();
	}

	public static Question<String> destination() {
		return actor -> Text.of(OutboundJourneySummary.DESTINATION).viewedBy(actor).asString();
	}

}
