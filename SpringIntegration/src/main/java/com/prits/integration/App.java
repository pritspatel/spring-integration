package com.prits.integration;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Splitter Aggregator Sample
 * 
 */
public class App {

	private static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/integration.xml");
		OrderGateway orderGateway = context.getBean("orderGateway",
				OrderGateway.class);
		Order reply = orderGateway.processOrder(getDummyOrder());
		logger.info("Replied with.......: " + reply.toString());
	}

	private static Order getDummyOrder() {

		Order order1 = new Order();
		order1.setId(100L);
		LineItem li1 = new LineItem();
		li1.setId(1L);
		li1.setName("iPad");
		li1.setProvider(1000);
		order1.getLineItems().add(li1);

		LineItem li2 = new LineItem();
		li2.setId(2L);
		li2.setProvider(2000);
		li2.setName("galaxy");
		order1.getLineItems().add(li2);

		return order1;
	}
}