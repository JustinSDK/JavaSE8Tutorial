package cc.openhome;

import static java.lang.System.out;
import java.util.*;
import java.util.function.Function;

class Person {
    String name;
    
    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
}

public class MethodReferenceDemo {
    static <P, R> List<R> map(List<P> list, Function<P, R> mapper) {
        List<R> mapped = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            mapped.add(mapper.apply(list.get(i)));
        }
        return mapped;
    }
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList(args);
        List<Person> persons = map(names, Person::new);
        persons.forEach(out::println);
    }
}
