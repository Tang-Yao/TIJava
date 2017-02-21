package exceptions;

import java.io.*;
import java.util.logging.*;

/**
 * Created by ty on 2016/9/26.
 */
public class LoggingException2 {

    private static Logger logger = Logger.getLogger("LoggingException2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String [] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}
