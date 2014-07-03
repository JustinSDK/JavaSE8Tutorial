package cc.openhome;

import java.util.concurrent.Executor;

public class DirectExecutor implements Executor {
     public void execute(Runnable r) {
         r.run();
     }    
}
