package com.innovactory.tranzer.client;

import org.slf4j.Logger;

public class LogBridge extends java.util.logging.Logger {

    private final Logger logger;

    public LogBridge(Logger logger, String name) {
        super(name, null);
        this.logger = logger;
    }

    @Override
    public void severe(String msg) {
        logger.error(msg);
    }

    @Override
    public void warning(String msg) {
        logger.warn(msg);
    }

    // Requests/responses are logged on info. Bit too much...
    @Override
    public void info(String msg) {
        logger.debug(msg);
    }

    @Override
    public void config(String msg) {
        logger.info(msg);
    }

    @Override
    public void fine(String msg) {
        logger.debug(msg);
    }

    @Override
    public void finer(String msg) {
        logger.debug(msg);
    }

    @Override
    public void finest(String msg) {
        logger.debug(msg);
    }
}
