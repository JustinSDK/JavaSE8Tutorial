package cc.openhome;

import static java.lang.String.format;

public enum Priority2 {
    MAX(10) {
        public String toString() {
            return format("(%2d) - 最大權限", value);
        }
    }, 
    NORM(5) {
        public String toString() {
            return format("(%2d) - 普通權限", value);
        }
    }, 
   
 MIN(1) {
        public String toString() {
            return format("(%2d) - 最小權限", value);
        }
    };
    
    protected int value;
    private Priority2(int value) {
        this.value = value;
    }
    public int value() {
        return value;
    }
    
    public static void main(String[] args) {
        for(Priority2 priority : Priority2.values()) {
            System.out.println(priority);
        }
    }
} 
