package cc.openhome;

import java.lang.reflect.Array;
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
    
     public E[] toArray() {
         E[] elements = null;
         if(size() > 0) {
             elements = (E[]) Array.newInstance(elems[0].getClass(), size());
             for(int i = 0; i < elements.length; i++) {
                 elements[i] = (E) elems[i];
             }
         }
         return elements;
     }
}
