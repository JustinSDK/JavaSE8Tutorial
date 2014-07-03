package cc.openhome;

public class Exercise {

    public static void main(String[] args) throws Exception {
        ClientQueue queue = new ClientQueue();
        ClientListenerInstaller installer = new ClientListenerInstaller(queue);
        installer.install(ClientLogger.class);
        
        Client c1 = new Client("127.0.0.1", "caterpillar");
        Client c2 = new Client("192.168.0.2", "justin");
        queue.add(c1);
        queue.add(c2);
        queue.remove(c1);
        queue.remove(c2);
    }
}
