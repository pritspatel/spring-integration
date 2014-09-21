package com.prits.integration;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class AppleService {

	private static final Logger logger = Logger.getLogger(AppleService.class);
	
	public LineItem processAppleOrder(LineItem li) {
		logger.info("Processing Apple LineItem : " + li.toString());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		li.setStatus("Success");
		return li;
	}
}
