package cc.openhome;

import java.util.*;

interface Request {
    void execute();
}

public class RequestQueue {
    public static void main(String[] args) {
        Queue requests = new LinkedList();
        offerRequestTo(requests);
        process(requests);
    }

    static void offerRequestTo(Queue requests) {
        // 模擬將請求加入佇列
        for (int i = 1; i < 6; i++) {
            Request request = new Request() {
                public void execute() {
                    System.out.printf("處理資料 %f%n", Math.random());
                }
            };
            requests.offer(request);
        }
    }
    // 處理佇列中的請求
    static void process(Queue requests) {
        while(requests.peek() != null) {
            Request request = (Request) requests.poll();
            request.execute();
        }
    }
}