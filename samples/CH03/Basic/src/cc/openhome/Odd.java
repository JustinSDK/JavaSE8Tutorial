package cc.openhome;

public class Odd {
    public static void main(String[] args) {
        int input = 10;
        int remain = input % 2; 
        if(remain == 1) { // 餘數為1就是奇數
            System.out.printf("%d 為奇數%n", input); 
        }
        else {
            System.out.printf("%d 為偶數%n", input); 
        }
    }
}
