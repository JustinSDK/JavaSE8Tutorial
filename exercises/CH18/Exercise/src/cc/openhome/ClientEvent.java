package cc.openhome;

public class ClientEvent {
    private Client client;
    public ClientEvent(Client client) {
        this.client = client;
    }
    
    public String getName() {
        return client.name;
    }
    
    public String getIp() {
        return client.ip;
    }
}
