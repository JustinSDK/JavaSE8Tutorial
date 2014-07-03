package cc.openhome;

import java.math.BigDecimal;

public class DecimalDemo2 {
    public static void main(String[] args) {
        BigDecimal op1 = new BigDecimal("0.1");
        BigDecimal op2 = new BigDecimal("0.1");
        BigDecimal op3 = new BigDecimal("0.1");
        BigDecimal result = new BigDecimal("0.3");
        if(op1.add(op2).add(op3).equals(result)) {
            System.out.println("等於 0.3");
        }
        else {
            System.out.println("不等於 0.3");
        }
    }
}