package by.orlov.chat.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tcpConnection);
    void onDisconnect(TCPConnection tcpConnection);
    void onReceiveString(TCPConnection tcpConnection, String value);
    void onException(TCPConnection tcpConnection, Exception e);

}
