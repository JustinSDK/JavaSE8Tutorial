package cc.openhome;

import java.io.Serializable;

public class ColumnInfo implements Serializable {
    private String name;
    private String type;
    private int size;
    private boolean nullable;
    private String def;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean isNullable() {
        return nullable;
    }
    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }
    public String getDef() {
        return def;
    }
    public void setDef(String def) {
        this.def = def;
    }
}
