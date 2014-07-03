package cc.openhome;

import java.util.Arrays;

public class ArrayList {
    private Object[] list;
    private int next;
   
    public ArrayList(int capacity) {
        list = new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(Object o) {
        if(next == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = o;
    }
    
    public Object get(int index) {
        return list[index];
    }
    
    public int size() {
        return next;
    }
}