package com.epma.lab.hw1;

import org.apache.log4j.Logger;

public class App {
	final static Logger logger = Logger.getLogger(App.class);

	public void logMessages() {
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");

	}
}