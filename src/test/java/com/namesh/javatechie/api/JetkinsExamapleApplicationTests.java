package com.namesh.javatechie.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JetkinsExamapleApplicationTests {

	public static Logger logger  = LoggerFactory.getLogger(JetkinsExamapleApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Testcase Executed!! ...");
		assertEquals(true, true);
	}

}
