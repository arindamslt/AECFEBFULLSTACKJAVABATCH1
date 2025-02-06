package com.arindam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
private static final Logger log=LogManager.getLogger(Test.class);
public static void processData()
{
	log.trace("FROM TRACE METHOD");
	log.debug("FROM DEBUG METHOD");
	log.info("FROM INFO METHOD");
	log.error("FROM ERROR METHOD");
	log.warn("FROM WARNING METHOD");
	log.fatal("FROM FATAL METHOD");
}
public static void main(String[] args) {
	processData();
}
}
