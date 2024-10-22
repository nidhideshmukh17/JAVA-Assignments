public class HTTPConnection implements Connectable, Disconnectable, Sendable, Receivable{
    @Override
    public void connect() {
        System.out.println("HTTP connected");
    }

    @Override
    public void disconnect() {
        System.out.println("HTTP disconnected");
    }

    @Override
    public void receive() {
        System.out.println("HTTP received");
    }

    @Override
    public void send(String message) {
        System.out.println("HTTP sent: " + message);
    }
}
