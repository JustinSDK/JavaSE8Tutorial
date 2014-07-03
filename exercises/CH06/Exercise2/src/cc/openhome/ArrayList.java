package cc.openhome;

import java.util.Arrays;

public class ArrayList {
    private Object[] elems;
    private int next;
    
    public ArrayList() {
        this(16);
    }
   
    public ArrayList(int capacity) {
        elems = new Object[capacity];
    }
    
    public void add(Object o) {
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = o;
    }
    
    public Object get(int index) {
        return elems[index];
    }
    
    public int size() {
        return next;
    }

    @Override
    public String toString() {
        StringBuilder desc = new StringBuilder();
        desc.append("ArrayList{");
        int last = next - 1;
        for(int i = 0; i < last; i++) {
            desc.append(list[i]).append(", ");
        }
        desc.append(list[last]).append("}");
        return desc.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        final ArrayList other = (ArrayList) obj;
        if (this.next != other.next) {
            return false;
        }
        return Arrays.deepEquals(this.list, other.list);
    }
}
