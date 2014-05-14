package deathcap.junket;

import java.util.logging.LogRecord;
import java.util.logging.Logger;

/*
Workaround for https://github.com/plasma-umass/doppio/issues/308
defining our own logger class without requiring LogManager (which uses a shutdown hook)
 */

public class SimpleLogger extends Logger {

    public SimpleLogger(String name, String bundle) {
        super(name, bundle);
    }

    public void log(LogRecord record) {
        System.out.println("["+record.getLevel()+"] "+record.getMessage());
    }
}
