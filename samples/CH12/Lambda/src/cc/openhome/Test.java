/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cc.openhome;

import java.util.*;
import static java.util.stream.Collectors.toList;

public class Test {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        List<String> itemNames = orders.stream()
                .map(order -> order.getLineItems())
                .flatMap(lineItems -> lineItems.stream())
                .map(LineItem::getName)
                .collect(toList());

    }

    private static class Order {

        public Order() {
        }

        private List<LineItem> getLineItems() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class LineItem {

        public LineItem() {
        }
        
        String getName() {
            return null;
        }
    }
}
