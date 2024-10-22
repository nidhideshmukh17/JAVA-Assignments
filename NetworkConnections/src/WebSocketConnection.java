public class WebSocketConnection implements Connectable, Disconnectable, Sendable, Receivable {
    @Override
    public void connect() {
        System.out.println("WebSocket connected");
    }

    @Override
    public void disconnect() {
        System.out.println("WebSocket disconnected");
    }

    @Override
    public void receive() {
        System.out.println("WebSocket received");
    }

    @Override
    public void send(String message) {
        System.out.println("WebSocket sent: " + message);
        receive();
    }
}
