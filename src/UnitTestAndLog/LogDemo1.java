package UnitTestAndLog;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo1 {
    //private static final Logger LOGGER = Logger.getLogger(LogDemo1.class);

    private static final Logger LOGGER = LoggerFactory.getLogger(LogDemo1.class);
    public static void main(String[] args) {
        LOGGER.debug("debug info");
        LOGGER.info("info");
        LOGGER.warn("warn info");
        LOGGER.error("error info");

    }

}
