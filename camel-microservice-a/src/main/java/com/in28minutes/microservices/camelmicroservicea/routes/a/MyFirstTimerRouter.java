package com.in28minutes.microservices.camelmicroservicea.routes.a;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class MyFirstTimerRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// timer
		// transformation
		// log
		// Exchange[ExchangePattern: InOnly, BodyType: null, Body: [Body is null]]
		from("timer:first-timer")
//		.transform().constant("My Constant Message")
		.transform().constant("Time now is " + java.time.LocalDateTime.now())
		.to("log:first-timer");

		
	}

}
