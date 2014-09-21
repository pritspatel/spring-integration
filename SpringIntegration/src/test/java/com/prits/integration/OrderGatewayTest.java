package com.prits.integration;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {"classpath:META-INF/spring/integration/integration.xml"}
)
public class OrderGatewayTest {

	@Autowired
	private OrderGateway orderGateway;
	
	@Test
	public void testOrderGateway() {
		Order o = orderGateway.processOrder(getDummyOrder());
		System.out.println(o.toString());
		Assert.notNull(o);
		Assert.notNull(o.getLineItems());
		List<LineItem> lis = o.getLineItems();
		for(LineItem li : lis) {
			Assert.hasText(li.getStatus(),"Success");
		}
		
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
