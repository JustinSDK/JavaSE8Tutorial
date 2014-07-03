package cc.openhome;

class Service {
    private WorkerThreadPool pool = new WorkerThreadPool();

    void accept(Request request) throws InterruptedException {
        pool.service(request);
    }
}

// 以下模擬客戶發出請求
class Client implements Runnable {
    private Service service;

    Client(Service service) {
        this.service = service;
    }

    public void run() {
        while (true) {
            try {
                service.accept(() -> System.out.println("執行客戶請求...XD"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 0; i < 5; i++) {
            (new Thread(new Client(service))).start();
        }
    }
}
