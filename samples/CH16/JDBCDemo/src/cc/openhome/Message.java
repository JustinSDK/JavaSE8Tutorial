package cc.openhome;

import java.io.Serializable;

public class Message implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String msg;

    public Message() {}
    
    public Message(String name, String email, String msg) {
        this.name = name;
        this.email = email;
        this.msg = msg;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
