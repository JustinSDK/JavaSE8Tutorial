package cc.openhome;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
    
    public ArrayList<E> filter(Predicate<E> predicate) {
        ArrayList<E> lt = new ArrayList<>();
        for(int i = 0; i < size(); i++) {
            E elem = get(i);
            if(predicate.test(elem)) {
                lt.add(elem);
            }
        }
        return lt;
    }
    
    public <R> ArrayList<R> map(Function<E, R> func) {
         ArrayList<R> lt = new ArrayList<>();
         for(int i = 0; i < size(); i++) {
             lt.add(func.apply(get(i)));
         }
         return lt;
    }
    
    public Optional<E> reduce(BinaryOperator<E> operator) {
        E result = get(0);
        for(int i = 1; i < size(); i++) {
            result = operator.apply(result, get(i));
        }
        return Optional.ofNullable(result);
    }
    
    public void forEach(Consumer<E> consumer) {
        for(int i = 0; i < size(); i++) {
            consumer.accept(get(i));
        }
    }
}
