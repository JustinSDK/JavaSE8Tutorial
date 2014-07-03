package cc.openhome;

public interface ClientListener {
    void clientAdded(ClientEvent event);    // 新增Client會呼叫這個方法
    void clientRemoved(ClientEvent event); // 移除Client會呼叫這個方法
}