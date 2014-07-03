package cc.openhome;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        ArrayList list1 = new ArrayList();
        list1.add(date1);
        list1.add(date2);
        list1.add(date3);
        
        ArrayList list2 = new ArrayList();
        list2.add(date1);
        list2.add(date2);
        list2.add(date3);
        System.out.println(list1.equals(list2));
        
        list2.add(new Date());
        System.out.println(list1.equals(list2));
    }
}
