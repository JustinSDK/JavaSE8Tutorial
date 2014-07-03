package cc.openhome;
public class Student {
    private String name;
    private Integer score;
    public Student() {}
    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public Integer getScore() {
        return score;
    }
}
