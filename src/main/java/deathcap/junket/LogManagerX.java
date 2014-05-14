package deathcap.junket;

import java.util.logging.LogManager;

public class LogManagerX extends LogManager {

    public LogManagerX() {
        this(0);
        System.out.println("constructing LogManagerX");
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

        //super();
    }

    private LogManagerX(int x) {

    }
}
