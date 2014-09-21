package com.prits.integration;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.Aggregator;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class OrderAggregator {

	private static final Logger logger = Logger
			.getLogger(OrderAggregator.class);

	@Aggregator
	public Order aggregateOrder(List<LineItem> lis) {
		
		logger.info("Aggregating processed lineitems");
		
		Assert.notNull(lis, "LineItem list should not be null");

		Order order = new Order();
		order.setId(100L);
		order.setLineItems(lis);
		
		logger.info("Final processed order : " + order.toString());
		return order;
	}
}
