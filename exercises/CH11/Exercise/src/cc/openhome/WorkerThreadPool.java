package cc.openhome;

import java.util.*;

public class WorkerThreadPool {
    private List<WorkerThread> workers = new ArrayList<>();
    
    public synchronized void service(Request request) throws InterruptedException {
        if(failedToAllocateIdleThread(request)) {
            WorkerThread workerThread = createWorkerThread();
            workerThread.setRequest(request);
        }
    }

    private boolean failedToAllocateIdleThread(Request request) {
        for(WorkerThread workerThread : workers) if(workerThread.isIdle()) {
            workerThread.setRequest(request);
            return false;
        }
        return true;
    }
    
    public synchronized void cleanIdle() {
        for(WorkerThread workerThread : workers) if(workerThread.isIdle()) {
           workers.remove(workerThread);
           workerThread.terminate();            
        }
    }
    
    private WorkerThread createWorkerThread() throws InterruptedException {
        WorkerThread workerThread = new WorkerThread();
        workerThread.start();
        workers.add(workerThread);
        Thread.sleep(1000); // 給點時間進入 Runnable
        return workerThread;
    }
}
