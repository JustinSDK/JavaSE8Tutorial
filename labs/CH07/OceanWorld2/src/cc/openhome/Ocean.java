package cc.openhome;

public class Ocean {
    public static void main(String[] args) {
        doSwim(new Anemonefish("尼莫"));
        doSwim(new Shark("蘭尼"));
        doSwim(new Human("賈斯汀"));
        doSwim(new Submarine("黃色一號"));
    }
    
    static void doSwim(Fish fish) {
        fish.swim();
    }
    
    static void doSwim(Human human) {
        human.swim();
    }
    
    static void doSwim(Submarine submarine) {
        submarine.swim();
    }
    

}
