package cc.openhome;

public class CallByValue {
    public static void main(String[] args) {
        Customer c1 = new Customer("Justin");
        some(c1);
        System.out.println(c1.name);
        
        Customer c2 = new Customer("Justin");
        other(c2);
        System.out.println(c2.name);
    }
    
    static void some(Customer c) {
        c.name = "John";
    }
    
    static void other(Customer c) {
        c = new Customer("Bill");
    }
}

class Customer {
    String name;
    Customer(String name) {
        this.name = name;
    }
}