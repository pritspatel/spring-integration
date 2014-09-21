package com.prits.integration;

import java.util.List;

import org.springframework.integration.annotation.Splitter;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class OrderRequestSplitter {

	@Splitter
	public List<LineItem> splitOrder(Order order) {
		Assert.notNull(order, "Mandatory argument missing.");
		Assert.noNullElements(order.getLineItems().toArray(),"Null lineitems");
		return order.getLineItems();
	}
}
