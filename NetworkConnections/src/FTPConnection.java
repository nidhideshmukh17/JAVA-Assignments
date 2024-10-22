public class FTPConnection implements Connectable, Disconnectable, Sendable{
    @Override
    public void connect() {
        System.out.println("FTP connected");
    }

    @Override
    public void disconnect() {
        System.out.println("FTP disconnected");
    }

    @Override
    public void send(String message) {
        System.out.println("FTP sent: " + message);
    }
}
