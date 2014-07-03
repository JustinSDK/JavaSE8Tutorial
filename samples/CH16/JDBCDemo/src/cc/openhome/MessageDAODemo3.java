package cc.openhome;

import static java.lang.System.out;
import java.util.Scanner;

public class MessageDAODemo3 {
    public static void main(String[] args) throws Exception {
        MessageDAO3 dao =
             new MessageDAO3(new SimpleConnectionPoolDataSource());

        // 在Windows的NetBeans中，其Output窗格的標準輸入編碼是Big5
        Scanner console = new Scanner(System.in, "Big5");
        while(true) {
            out.print("(1) 顯示留言 (2) 新增留言：");
            switch(Integer.parseInt(console.nextLine())) {
                case 1:
                    dao.get().forEach(message -> {
                        out.printf("%d\t%s\t%s\t%s%n", 
                                message.getId(), 
                                message.getName(), 
                                message.getEmail(), 
                                message.getMsg());
                    });
                    break;
                case 2:
                    out.print("姓名：");
                    String name = console.nextLine();
                    out.print("郵件：");
                    String email = console.nextLine();
                    out.print("留言：");
                    String msg = console.nextLine();
                    dao.add(new Message(name, email, msg));
            }
        }
    }
} 
