package cc.openhome;

import java.util.Arrays;

public class ArrayList<E> {
    private Object[] elems;
    private int next;
   
    public ArrayList(int capacity) {
        elems = new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(E e) {
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = e;
    }
    
    public E get(int index) {
        return (E) elems[index];
    }
    
    public int size() {
        return next;
    }
}
