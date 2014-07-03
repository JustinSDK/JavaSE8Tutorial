package cc.openhome;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
            new CashCard("A001", 500, 0),
            new CashCard("A002", 300, 0),
            new CashCard("A003", 1000, 1),
            new CashCard("A004", 2000, 2),
            new CashCard("A005", 3000, 3)
        };
        
        for(CashCard card : cards) {
            System.out.printf("(%s, %d, %d)%n",
                    card.number, card.balance, card.bonus);
        }
    }
}
