package cc.openhome;

import java.util.*;

class Account {
    private String name;
    private String number;
    private int balance;

    Account(String name, String number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account(%s, %s, %d)", name, number, balance);
    } 
}

public class Sort2 {
    public static void main(String[] args) {
        List accounts = Arrays.asList(
                new Account("Justin", "X1234", 1000),
                new Account("Monica", "X5678", 500),
                new Account("Irene", "X2468", 200)
        );
        Collections.sort(accounts);
        System.out.println(accounts);
    }
}
