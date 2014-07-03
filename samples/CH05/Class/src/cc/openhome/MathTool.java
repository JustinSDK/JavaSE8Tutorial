package cc.openhome;

public class MathTool {
    public static int sum(int... numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}