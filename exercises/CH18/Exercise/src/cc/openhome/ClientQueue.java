package cc.openhome;

import java.util.*;

public class ClientQueue {
    private List<Client> clients = new ArrayList<>();
    private List<ClientListener> listeners = new ArrayList<>();
            
    public void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }
    
    public void add(Client client) {
        clients.add(client);
        ClientEvent event = new ClientEvent(client);
        listeners.forEach(listener -> listener.clientAdded(event));
    }
    
    public void remove(Client client) {
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        listeners.forEach(listener -> listener.clientRemoved(event));
    }
}
