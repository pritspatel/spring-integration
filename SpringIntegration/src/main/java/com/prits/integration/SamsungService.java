package com.prits.integration;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class SamsungService {

private static final Logger logger = Logger.getLogger(SamsungService.class);
	
	public LineItem processSamsungOrder(LineItem li) {
		logger.info("Processing Samsung LineItem : " + li.toString());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		li.setStatus("Success");
		return li;
	}
}
