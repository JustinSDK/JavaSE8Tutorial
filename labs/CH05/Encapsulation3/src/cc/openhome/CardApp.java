package cc.openhome;

import java.util.Scanner;

public class CardApp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        CashCard card1 = new CashCard("A001", 500, 0);
        card1.balance += console.nextInt();
        card1.bonus += 100;


        CashCard card2 = new CashCard("A002", 300, 0);
        card2.balance += console.nextInt();
        card2.bonus += 100;

        CashCard card3 = new CashCard("A003", 1000, 1);
        card3.balance += console.nextInt();
        card3.bonus += 100;
        
        System.out.printf("明細 (%s, %d, %d)%n",
                    card1.number, card1.balance, card1.bonus);
        System.out.printf("明細 (%s, %d, %d)%n",
                    card2.number, card2.balance, card2.bonus);
        System.out.printf("明細 (%s, %d, %d)%n",
                    card3.number, card3.balance, card3.bonus);
    }
}
