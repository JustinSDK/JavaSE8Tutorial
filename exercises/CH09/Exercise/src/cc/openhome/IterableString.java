package cc.openhome;

import java.util.Iterator;

public class IterableString implements Iterable<Character> {
    private String original;

    public IterableString(String original) {
        this.original = original;
    }

    public Iterator<Character> iterator() {
        return new InnerIterator();
    }
	
    private class InnerIterator implements Iterator<Character> {
        private int index;
        public boolean hasNext() {
            return index < original.length();
        }

        public Character next() {
            Character c = original.charAt(index);
            index++;
            return c;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
