package cc.openhome;

import static java.lang.System.out;

public class ClientLogger {
    @ClientAdded
    public void clientAdded(ClientEvent event) {
        out.println(event.getIp() + " added...");
    }
	
    @ClientRemoved
    public void clientRemoved(ClientEvent event) {
        out.println(event.getIp() + " removed...");
    }
}