package cc.openhome;

import cc.openhome.virtual.CashCard;
import java.util.Scanner;

public class CardApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        CashCard card1 = new CashCard("A001", 500, 0);
        card1.store(console.nextInt());

        CashCard card2 = new CashCard("A002", 300, 0);
        card2.store(console.nextInt());

        CashCard card3 = new CashCard("A003", 1000, 1);
        card3.store(console.nextInt());
        
        System.out.printf("明細 (%s, %d, %d)%n",
                    card1.getNumber(), card1.getBalance(), card1.getBonus());
        System.out.printf("明細 (%s, %d, %d)%n",
                    card2.getNumber(), card2.getBalance(), card2.getBonus());
        System.out.printf("明細 (%s, %d, %d)%n",
                    card3.getNumber(), card3.getBalance(), card3.getBonus());
    }
}
