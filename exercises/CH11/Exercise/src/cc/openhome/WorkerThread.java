package cc.openhome;

public class WorkerThread extends Thread {
    private Request request;
    private boolean isContinue = true;

    public boolean isIdle() {
        return request == null;
    }

    public synchronized void setRequest(Request request) {
        if (isIdle()) {
            this.request = request;
            notify();
        }
    }

    public synchronized void run() {
        while (isContinue) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            request.execute();
            request = null;
        }
    }

    public void terminate() {
        isContinue = false;
        setRequest(() -> {});
    }
}
