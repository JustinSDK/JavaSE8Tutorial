package cc.openhome;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Justin", 39, Gender.MALE),
                new Employee("Monica", 36, Gender.FEMALE),
                new Employee("Irene", 6, Gender.FEMALE)
        );
        
        int sum = employees.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                .mapToInt(Employee::getAge)
                .sum();

        int average = (int) employees.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble();

        int max = employees.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                .mapToInt(Employee::getAge)
                .max()
                .getAsInt();
        
        Arrays.asList(sum, average, max).forEach(out::println);
    }
}

enum Gender { FEMALE, MALE }

class Employee {
    private String name;
    private Integer age;
    private Gender gender;

    public Employee(String name, Integer age, Gender gender) {
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

    public Gender getGender() {
        return gender;
    }
}
