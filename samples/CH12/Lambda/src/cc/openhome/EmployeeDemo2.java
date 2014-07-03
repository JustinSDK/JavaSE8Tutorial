package cc.openhome;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.List;

public class EmployeeDemo2 {
    public static void main(String[] args) {
        List<Employee2> employees = Arrays.asList(
                new Employee2("Justin", 39, Gender2.MALE),
                new Employee2("Monica", 36, Gender2.FEMALE),
                new Employee2("Irene", 6, Gender2.FEMALE)
        );
        
        int sum = employees.stream()
                .filter(employee -> employee.getGender() == Gender2.MALE)
                .mapToInt(Employee2::getAge)
                .reduce((total, age) ->  total + age)
                .getAsInt();

        long males = employees.stream()
                .filter(employee -> employee.getGender() == Gender2.MALE)
                .count();
        
        long average = employees.stream()
                .filter(employee -> employee.getGender() == Gender2.MALE)
                .mapToInt(Employee2::getAge)
                .reduce((total, age) ->  total + age)
                .getAsInt() / males;

        int max = employees.stream()
                .filter(employee -> employee.getGender() == Gender2.MALE)
                .mapToInt(Employee2::getAge)
                .reduce(0, (currMax, age) -> age > currMax ? age : currMax);
        
        Arrays.asList(sum, average, max).forEach(out::println);
    }
}

enum Gender2 { FEMALE, MALE }

class Employee2 {
    private String name;
    private Integer age;
    private Gender2 gender;

    public Employee2(String name, Integer age, Gender2 gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender2 getGender() {
        return gender;
    }
}
