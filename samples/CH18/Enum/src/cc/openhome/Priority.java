package cc.openhome;

public enum Priority {
    MAX(10), NORM(5), MIN(1); 
    
    private int value;
    private Priority(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
    
    public static void main(String[] args) {
        for(Priority priority : Priority.values()) {
            System.out.printf("Priority(%s, %d)%n",
                  priority, priority.value());
        }
    }
}
