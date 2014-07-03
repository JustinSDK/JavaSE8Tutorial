package cc.openhome;
class Fruit {
    int price;
    int weight;
    Fruit() {}
    Fruit(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }
}
class Apple extends Fruit {
    Apple() {}
    Apple(int price, int weight) {
         super(price, weight);
    }
    @Override
    public String toString() {
        return "Apple";
    }
}

class Banana extends Fruit {
    Banana() {}
    Banana(int price, int weight) {
         super(price, weight);
    }
    @Override
    public String toString() {
        return "Banana";
    }
}
