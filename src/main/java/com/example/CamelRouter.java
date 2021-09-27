package com.example;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class CamelRouter extends RouteBuilder {

	@Value("${greeting}")
	private String greeting;

	@Override
	public void configure() throws Exception {
		// @formatter:off

		rest()
			.get("/hello").produces(MediaType.TEXT_PLAIN_VALUE).to("direct:hello");

		from("direct:hello")
			.transform().simple(greeting);

		// @formatter:on
	}

}
