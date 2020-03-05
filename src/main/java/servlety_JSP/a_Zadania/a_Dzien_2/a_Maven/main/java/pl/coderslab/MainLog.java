package servlety_JSP.a_Zadania.a_Dzien_2.a_Maven.main.java.pl.coderslab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainLog {

    private static final Logger log = LogManager.getLogger(MainLog.class);

    public static void main(String[] args) {
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        log.fatal("Fatal");

        log.info("string: {}.", "Hello world");
    }
}