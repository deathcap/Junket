package deathcap.junket;

import java.util.logging.LogManager;

public class LogManager2 extends LogManager {

    private static LogManager2 instance;

    protected LogManager2() {
        // to workaround https://github.com/plasma-umass/doppio/issues/308
        // removed java.util.logging.LogManager constructor shutdown hook:
        /*
            // Add a shutdown hook to close the global handlers.
 	          try {
         Runtime.getRuntime().addShutdownHook(new Cleaner());
         } catch (IllegalStateException e) {
             // If the VM is already shutting down,
             // We do not need to register shutdownHook.
         */
    }

    public static LogManager getLogManager2() {
        if (instance == null) {
            instance = new LogManager2();
        }

        return instance;
    }
}
