package com.mathieularose;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.debug("Hello world.");
        logger.debug("Hello \"world2.");
    }
}
