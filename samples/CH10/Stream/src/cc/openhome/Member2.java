package cc.openhome;

import java.io.*;

public class Member2 implements Serializable {
    private String number;
    private String name;
    private int age;

    public Member2(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", number, name, age);
    }
    
    public void save() throws IOException {
        try(ObjectOutputStream output = 
                new ObjectOutputStream(new FileOutputStream(number))) {
            output.writeObject(this);
        } 
    }
    
    public static Member2 load(String number) 
                    throws IOException, ClassNotFoundException {
        Member2 member;
        try(ObjectInputStream input = 
                new ObjectInputStream(new FileInputStream(number))) {
            member = (Member2) input.readObject(); 
        } 
        return member;
    }
}
