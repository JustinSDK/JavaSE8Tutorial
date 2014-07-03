package cc.openhome;

import java.util.Scanner;

public class CardApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        CashCard card1 = new CashCard("A001", 500, 0);
        int money = console.nextInt();
        if(money > 0) {
            card1.balance += money;
            if(money >= 1000) {
                card1.bonus++;
            }
        }
        else {
            System.out.println("儲值是負的？你是來亂的嗎？");
        }
        
        CashCard card2 = new CashCard("A002", 300, 0);
        money = console.nextInt();
        if(money > 0) {
            card2.balance += money;
            if(money >= 1000) {
                card2.bonus++;
            }
        }
        else {
            System.out.println("儲值是負的？你是來亂的嗎？");
        }
        
        CashCard card3 = new CashCard("A003", 1000, 1);
        money = console.nextInt();
        if(money > 0) {
            card3.balance += money;
            if(money >= 1000) {
                card3.bonus++;
            }
        }
        else {
            System.out.println("儲值是負的？你是來亂的嗎？");
        }
    }
}
