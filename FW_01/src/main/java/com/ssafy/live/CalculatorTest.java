package com.ssafy.live;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {
	public static final Logger log = LoggerFactory.getLogger(CalculatorTest.class);
	public static void main(String[] args) {
//		log.trace("level: {}", "trace level");
//		log.debug("level: {}", "debug level");
//		log.info("level: {}", "info level");
//		log.warn("level: {}", "warn level");
//		log.error("level: {}", "error level");
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		System.out.println(result);
	}

}
